package no.unit.marc;

import no.unit.marc.utils.DocumentBuilderCreator;
import no.unit.marc.utils.StringUtils;
import org.marc4j.MarcXmlReader;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class Marc21RecordParser {

    private static final String EMPTY_STRING = "";
    private static final String RECORD = "record";
    private static final String DOES_NOT_START_WITH_RECORD_ERROR = "The xml string does "
            + "not start with the <record> tag, please make sure that is does end and start with <record> </record>";
    private static final String EXCEPTION_MESSAGE = "Caught an error while converting to "
            + "reference object, make sure that the xml string used is  correct";

    /**
     * Parses an xml representation of a Marc21 record to convert it into a Reference object.
     *
     * @param xml marc21-xml record
     * @return Reference object.
     * @throws Marc21XmlParserException some stream reading went south
     */
    public static Reference getReferenceObjectFromMarc21XmlRecord(String xml) throws Marc21XmlParserException {
        Reference reference = new Reference();
        reference.setXmlPresentation(xml);
        try {
            Document doc = asDocument(xml);
            checkFirstTag(doc);
            LinePresentation linePresentation = new LinePresentation(doc);
            reference.setLinePresentation(linePresentation.getPresentation());
            Record record = asMarcRecord(doc);

            if (record != null) {
                extractMetadata(record, reference);
            }
        } catch (TransformerException | ParserConfigurationException | SAXException | IOException e) {
            throw new Marc21XmlParserException(EXCEPTION_MESSAGE, e);
        }
        return reference;
    }

    private static void checkFirstTag(Document xmlDoc) throws Marc21XmlParserException {
        if (!RECORD.equals(xmlDoc.getFirstChild().getNodeName())) {
            throw new Marc21XmlParserException(DOES_NOT_START_WITH_RECORD_ERROR);
        }
    }

    @SuppressWarnings({"PMD.NcssCount", "PMD.CognitiveComplexity"})
    private static void extractMetadata(Record record, Reference reference) {
        List<ControlField> controlFieldList = record.getControlFields();
        for (ControlField controlField : controlFieldList) {
            String controlFieldTag = controlField.getTag();
            if (controlFieldTag.equals(Marc21Constants.MARC_TAG_001)) {
                reference.setId(controlField.getData());
            }
        }
        List<DataField> datafieldList = record.getDataFields();
        boolean standardTitleIn130 = false;
        for (DataField dataField : datafieldList) {
            String datafieldTag = dataField.getTag();
            switch (datafieldTag) {
                case Marc21Constants.MARC_TAG_020:
                    Subfield subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_A);
                    if (subfield != null) {
                        String isbn = subfield.getData();
                        if (StringUtils.isNotEmpty(isbn)) {
                            reference.addIsbn(isbn);
                        }
                    }
                    break;
                case Marc21Constants.MARC_TAG_022:
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_A);
                    if (subfield != null) {
                        String issn = subfield.getData();
                        if (StringUtils.isNotEmpty(issn)) {
                            reference.addIssn(issn);
                        }
                    }
                    break;
                case Marc21Constants.MARC_TAG_100:
                case Marc21Constants.MARC_TAG_110:
                case Marc21Constants.MARC_TAG_111:
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_A);
                    String name = null;
                    if (subfield != null) {
                        name = subfield.getData();
                    }
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_D);
                    String date = null;
                    if (subfield != null) {
                        date = subfield.getData();
                    }
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_0);
                    String id = null;
                    if (subfield != null) {
                        id = subfield.getData();
                    }
                    if (Objects.nonNull(name)) {
                        AuthorReference author = createAuthor(name, date, id);
                        reference.addAuthor(author);
                    }
                    break;
                case Marc21Constants.MARC_TAG_130:
                    handleTitles(reference, dataField);
                    standardTitleIn130 = StringUtils.isNotEmpty(reference.getMainTitle());
                    break;
                case Marc21Constants.MARC_TAG_260:
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_B);
                    if (subfield != null) {
                        String publisher = subfield.getData();
                        if (StringUtils.isNotEmpty(publisher)) {
                            reference.setPublisher(publisher);
                        }
                    }
                    subfield = dataField.getSubfield(Marc21Constants.MARC_CODE_C);
                    if (subfield != null) {
                        String year = subfield.getData();
                        if (StringUtils.isNotEmpty(year)) {
                            reference.setYear(year);
                        }
                    }
                    break;
                case Marc21Constants.MARC_TAG_245:
                case Marc21Constants.MARC_TAG_246:
                case Marc21Constants.MARC_TAG_730:
                case Marc21Constants.MARC_TAG_740:
                    if (!standardTitleIn130) {
                        handleTitles(reference, dataField);
                    }
                    break;
                default:
                    //ingenting
            }
        }
    }

    private static AuthorReference createAuthor(String name, String date, String id) {
        return new AuthorReference(name, date, id);
    }

    private static void handleTitles(Reference reference, DataField dataField) {
        if (StringUtils.isEmpty(reference.getMainTitle())) {
            extractSubfieldData(dataField, reference::setMainTitle, Marc21Constants.MARC_CODE_A);
            extractSubfieldData(dataField, reference::setParalleltitle, Marc21Constants.MARC_CODE_B);
            extractSubfieldData(dataField, reference::setStatementOfResponsibility, Marc21Constants.MARC_CODE_C);
            extractSubfieldData(dataField, reference::setNumberOfPartTitle, Marc21Constants.MARC_CODE_N);
        }
    }

    private static void extractSubfieldData(DataField dataField, Consumer<String> setParalleltitle, char subCode) {
        Subfield subfield;
        subfield = dataField.getSubfield(subCode);
        if (subfield != null) {
            Optional<String> subfieldData = Optional.ofNullable(subfield.getData());
            subfieldData.ifPresent(setParalleltitle);
        }
    }

    private static Record asMarcRecord(Document doc) throws TransformerException {
        ByteArrayOutputStream outputStream = removeStylesheet(doc);
        return new MarcXmlReader(new ByteArrayInputStream(outputStream.toByteArray())).next();
    }

    private static ByteArrayOutputStream removeStylesheet(Document result) throws TransformerException {
        Source source = new DOMSource(result);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Result outputTarget = new StreamResult(outputStream);
        TransformerFactory.newInstance().newTransformer().transform(source, outputTarget);
        return outputStream;
    }

    private static Document asDocument(String sruXml) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilder builder = DocumentBuilderCreator.createSecureDocumentBuilder();
        String removedMarcInSruXml = sruXml.replace(Marc21Constants.MARC_PREFIX, EMPTY_STRING);
        InputSource is = new InputSource(new StringReader(removedMarcInSruXml));
        return builder.parse(is);
    }
}
