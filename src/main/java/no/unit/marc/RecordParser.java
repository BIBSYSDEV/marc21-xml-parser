package no.unit.marc;

import org.apache.commons.lang3.StringUtils;
import org.marc4j.MarcXmlReader;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@SuppressWarnings("PMD.GodClass")
public class RecordParser {

    public static final String MARC_TAG_020 = "020";
    public static final String MARC_TAG_022 = "022";
    public static final String MARC_TAG_035 = "035";
    public static final String MARC_TAG_100 = "100";
    public static final String MARC_TAG_110 = "110";
    public static final String MARC_TAG_111 = "111";
    public static final String MARC_TAG_130 = "130";
    public static final String MARC_TAG_245 = "245";
    public static final String MARC_TAG_246 = "246";
    public static final String MARC_TAG_260 = "260";
    public static final String MARC_TAG_730 = "730";
    public static final String MARC_TAG_740 = "740";
    public static final char MARC_CODE_A = 'a';
    public static final char MARC_CODE_B = 'b';
    public static final char MARC_CODE_C = 'c';
    public static final char MARC_CODE_D = 'd';
    public static final char MARC_CODE_N = 'n';
    public static final char MARC_CODE_0 = '0';
    public static final String ALMA_PREFIX = "(Alma)";
    public static final String MARC_PREFIX = "marc:";
    public static final String LEADER = "leader";
    public static final String CONTROLFIELD = "controlfield";
    public static final String DATAFIELD = "datafield";
    public static final String SUBFIELD = "subfield";
    public static final String TAG = "tag";
    public static final String CODE = "code";
    public static final String IND_1 = "ind1";
    public static final String IND_2 = "ind2";
    public static final String LDR = "ldr";
    public static final String EMPTY_STRING = "";
    public static final String BLANK = " ";
    public static final char STAR = '*';
    public static final String HASH = "#";
    public static final char DOLLAR = '$';


    /**
     * Parses a SRU-response to extract the title of an marc21xml-record.
     *
     * @param xml marc21-xml record
     * @return simple json with <code>title</code>
     * @throws IOException                  some stream reading went south
     * @throws TransformerException         some stream reading went south
     * @throws SAXException                 some stream reading went south
     * @throws ParserConfigurationException some stream reading went south
     * @throws XPathExpressionException     some stream reading went south
     */
    public Reference parse(String xml) throws IOException,
            TransformerException, SAXException, ParserConfigurationException, XPathExpressionException {
        Reference reference = new Reference();
        reference.setXmlPresentation(xml);
        reference.setLinePresentation(parseSruToLinepresentation(xml));
        Record record = getFirstMarcRecord(xml);
        if (record != null) {
            extractMetadata(record, reference);
        }
        return reference;
    }

    @SuppressWarnings("PMD.NcssCount")
    private void extractMetadata(Record record, Reference reference) {
        List<DataField> datafieldList = record.getDataFields();
        boolean standardTitleIn130 = false;
        for (DataField dataField : datafieldList) {
            String datafieldTag = dataField.getTag();
            switch (datafieldTag) {
                case MARC_TAG_020:
                case MARC_TAG_022:
                    Subfield subfield = dataField.getSubfield(MARC_CODE_A);
                    if (subfield != null) {
                        String issn = subfield.getData();
                        if (StringUtils.isNotEmpty(issn)) {
                            reference.setIsbn(issn);
                        }
                    }
                    break;
                case MARC_TAG_035:
                    subfield = dataField.getSubfield(MARC_CODE_A);
                    if (subfield != null) {
                        String almaId = subfield.getData();
                        if (StringUtils.isNotEmpty(almaId) && almaId.startsWith(ALMA_PREFIX)
                                && StringUtils.isEmpty(reference.getId())) {
                            almaId = almaId.replace(ALMA_PREFIX, EMPTY_STRING);
                            reference.setId(almaId);
                        }
                    }
                    break;
                case MARC_TAG_100:
                case MARC_TAG_110:
                case MARC_TAG_111:
                    subfield = dataField.getSubfield(MARC_CODE_A);
                    String name = null;
                    if (subfield != null) {
                        name = subfield.getData();
                    }
                    subfield = dataField.getSubfield(MARC_CODE_D);
                    String date = null;
                    if (subfield != null) {
                        date = subfield.getData();
                    }
                    subfield = dataField.getSubfield(MARC_CODE_0);
                    String id = null;
                    if (subfield != null) {
                        id = subfield.getData();
                    }
                    if (Objects.nonNull(name)) {
                        AuthorReference author = this.createAuthor(name, date, id);
                        reference.addAuthor(author);
                    }
                    break;
                case MARC_TAG_130:
                    handleTitles(reference, dataField);
                    standardTitleIn130 = StringUtils.isNotEmpty(reference.getMainTitle());
                    break;
                case MARC_TAG_245:
                case MARC_TAG_246:
                    if (!standardTitleIn130) {
                        handleTitles(reference, dataField);
                    }
                    break;
                case MARC_TAG_260:
                    subfield = dataField.getSubfield(MARC_CODE_B);
                    if (subfield != null) {
                        String publisher = subfield.getData();
                        if (StringUtils.isNotEmpty(publisher)) {
                            reference.setPublisher(publisher);
                        }
                    }
                    subfield = dataField.getSubfield(MARC_CODE_C);
                    if (subfield != null) {
                        String year = subfield.getData();
                        if (StringUtils.isNotEmpty(year)) {
                            reference.setYear(year);
                        }
                    }
                    break;
                case MARC_TAG_730:
                case MARC_TAG_740:
                    if (!standardTitleIn130) {
                        handleTitles(reference, dataField);
                    }
                    break;
                default:
                    //ingenting
            }
        }
    }

    private AuthorReference createAuthor(String name, String date, String id) {
        return new AuthorReference(name, date, id);
    }

    private void handleTitles(Reference reference, DataField dataField) {
        if (StringUtils.isEmpty(reference.getMainTitle())) {
            Subfield subfield = dataField.getSubfield(MARC_CODE_A);
            if (subfield != null) {
                Optional<String> mainTitle = Optional.ofNullable(subfield.getData());
                mainTitle.ifPresent(reference::setMainTitle);
            }
            subfield = dataField.getSubfield(MARC_CODE_B);
            if (subfield != null) {
                Optional<String> parallelTitle = Optional.ofNullable(subfield.getData());
                parallelTitle.ifPresent(reference::setParalleltitle);
            }
            subfield = dataField.getSubfield(MARC_CODE_C);
            if (subfield != null) {
                Optional<String> statementOfResponsibility =
                        Optional.ofNullable(subfield.getData());
                statementOfResponsibility.ifPresent(reference::setStatementOfResponsibility);
            }
            subfield = dataField.getSubfield(MARC_CODE_N);
            if (subfield != null) {
                Optional<String> numberOfPartTitle = Optional.ofNullable(subfield.getData());
                numberOfPartTitle.ifPresent(reference::setNumberOfPartTitle);
            }
        }
    }

    private Record getFirstMarcRecord(String xml) throws TransformerException{
            Document result = parseSruXml(xml);
            ByteArrayOutputStream outputStream = removeStylesheet(result);
            return readRecordFromCleanXml(outputStream);
    }

    private Record readRecordFromCleanXml(ByteArrayOutputStream outputStream) {
        return new MarcXmlReader(new ByteArrayInputStream(outputStream.toByteArray())).next();
    }

    private ByteArrayOutputStream removeStylesheet(Document result) throws TransformerException {
        Source source = new DOMSource(result);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Result outputTarget = new StreamResult(outputStream);
        TransformerFactory.newInstance().newTransformer().transform(source, outputTarget);
        return outputStream;
    }

    private String parseSruToLinepresentation(String sruxml) {
        StringBuilder lineFormat = new StringBuilder();
        Document doc = parseSruXml(sruxml);
        if (doc != null) {
            NodeList leaderNodeList = doc.getElementsByTagName(LEADER);
            for (int i = 0; i < leaderNodeList.getLength(); i++) {
                Node item = leaderNodeList.item(i);
                String ldr = item.getFirstChild().getNodeValue();
                lineFormat.append(STAR).append(LDR).append(BLANK).append(ldr).append(System.lineSeparator());
            }
            NodeList controlfieldNodeList = doc.getElementsByTagName(CONTROLFIELD);
            for (int i = 0; i < controlfieldNodeList.getLength(); i++) {
                Node item = controlfieldNodeList.item(i);
                String controlfieldValue = item.getFirstChild().getNodeValue();
                String controlfieldTag = ((Element) item).getAttribute(TAG);
                lineFormat.append(STAR).append(controlfieldTag).append(BLANK).append(controlfieldValue)
                        .append(System.lineSeparator());
            }
            NodeList datafieldNodeList = doc.getElementsByTagName(DATAFIELD);
            for (int i = 0; i < datafieldNodeList.getLength(); i++) {
                Node item = datafieldNodeList.item(i);
                Element element = (Element) item;
                String datafieldInd1 = element.getAttribute(IND_1);
                String datafieldTag = element.getAttribute(TAG);
                lineFormat.append(STAR).append(datafieldTag);
                if (BLANK.equals(datafieldInd1)) {
                    datafieldInd1 = HASH;
                }
                if (datafieldInd1 != null) {
                    lineFormat.append(EMPTY_STRING).append(datafieldInd1);
                }
                String datafieldInd2 = element.getAttribute(IND_2);
                if (BLANK.equals(datafieldInd2)) {
                    datafieldInd2 = HASH;
                }
                if (datafieldInd2 != null) {
                    lineFormat.append(EMPTY_STRING).append(datafieldInd2);
                }
                NodeList subfieldNodes = element.getElementsByTagName(SUBFIELD);
                for (int j = 0; j < subfieldNodes.getLength(); j++) {
                    Element subfieldNode = (Element) subfieldNodes.item(j);
                    String codeTag = subfieldNode.getAttribute(CODE);
                    String subfieldText = subfieldNode.getTextContent();
                    lineFormat.append(BLANK).append(DOLLAR).append(codeTag).append(subfieldText);
                }
                lineFormat.append(System.lineSeparator());
            }
        }
        return lineFormat.toString().trim();
    }


    private Document parseSruXml(String sruxml) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String removedMarcInSruXml = sruxml.replace(MARC_PREFIX, EMPTY_STRING);
            InputSource is = new InputSource(new StringReader(removedMarcInSruXml));
            document = builder.parse(is);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Something went wrong during parsing of sruResponse. " + e.getMessage());
        }
        return document;
    }
}
