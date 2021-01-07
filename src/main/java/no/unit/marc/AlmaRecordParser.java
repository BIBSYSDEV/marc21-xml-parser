package no.unit.marc;

import org.apache.commons.lang3.StringUtils;
import org.marc4j.MarcXmlReader;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.util.List;
import java.util.Optional;

public class AlmaRecordParser {

    public static final String MARC_DATAFIELD_020 = "020";
    public static final String MARC_DATAFIELD_022 = "022";
    public static final String MARC_DATAFIELD_100 = "100";
    public static final String MARC_DATAFIELD_245 = "245";
    public static final char MARC_SUBFIELD_A = 'a';
    public static final char MARC_SUBFIELD_B = 'b';
    public static final String BLANK = " ";
    public static final String MARC_RECORD_XPATH = "//marc:record";
    public static final String MARC_NAMESPACE = "http://www.loc.gov/MARC21/slim";
    public static final String COLLECTION_ELEMENT = "collection";
    public static final int FIRST_NODE = 0;


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
        reference.setLinePresentation(parseSRUToLinepresentation(xml));
        Record record = getFirstMarcRecord(xml);
        if (record != null) {
            extractMetadata(record, reference);
        }
        return reference;
    }


    private void extractMetadata(Record record, Reference reference) {
        List<DataField> datafieldList = record.getDataFields();
        boolean standardTitleIn130 = false;
        for (int j = 0; j < datafieldList.size(); j++) {
            DataField dataField = datafieldList.get(j);
            String datafieldTag = dataField.getTag();
            switch (datafieldTag) {
                case "020":
                case "022":
                    String issn = dataField.getSubfield('a').getData();
                    if (!issn.isEmpty()) {
                        reference.setIsbn(issn);
                    }
                    break;
                case "035":
                    String almaId = dataField.getSubfield('a').getData();
                    if (!almaId.isEmpty() && almaId.startsWith("(Alma)") && reference.getId().isEmpty()) {
                        almaId = almaId.replace("(Alma)", "");
                        reference.setId(almaId);
                    }
                    break;
                case "100":
                case "110":
                case "111":
                    String creator = dataField.getSubfield('a').getData();
                    if (!creator.isEmpty()) {
                        String authorOnBean = reference.getAuthor();
                        if (!authorOnBean.isEmpty()) {
                            reference.setAuthor(authorOnBean + "; " + creator);
                        } else {
                            reference.setAuthor(creator);
                        }
                    }
                    break;
                case "130":
                    handleTitles(reference, dataField);
                    standardTitleIn130 = StringUtils.isNotEmpty(reference.getMainTitle());
                    break;
                case "245":
                case "246":
                    if (!standardTitleIn130) {
                        handleTitles(reference, dataField);
                    }
                    break;
                case "260":
                    String publisher = dataField.getSubfield('b').getData();
                    if (!publisher.isEmpty()) {
                        reference.setPublisher(publisher);
                    }
                    String year = dataField.getSubfield('c').getData();
                    if (!year.isEmpty()) {
                        reference.setYear(year);
                    }
                    break;
                case "730":
                case "740":
                    if (!standardTitleIn130) {
                        handleTitles(reference, dataField);
                    }
                    break;
                default:
                    //ingenting
            }
        }
    }

    private void handleTitles(Reference reference, DataField dataField) {
        if (reference.getMainTitle().isEmpty()) {
            Optional<String> mainTitle = Optional.ofNullable(dataField.getSubfield('a').getData());
            mainTitle.ifPresent(reference::setMainTitle);
            Optional<String> parallelTitle = Optional.ofNullable(dataField.getSubfield('b').getData());
            parallelTitle.ifPresent(reference::setParalleltitle);
            Optional<String> statementOfResponsibility = Optional.ofNullable(dataField.getSubfield('c').getData());
            statementOfResponsibility.ifPresent(reference::setStatementOfResponsibility);
            Optional<String> numberOfPartTitle = Optional.ofNullable(dataField.getSubfield('c').getData());
            numberOfPartTitle.ifPresent(reference::setNumberOfPartTitle);
        }
    }


    private Record getFirstMarcRecord(String xml) throws TransformerException,
            XPathExpressionException, IOException, SAXException, ParserConfigurationException {

        DocumentBuilder documentBuilder = createDocumentBuilder();
        Optional<Node> element = extractFirstMarcRecord(xml, documentBuilder);

        Record record = null;
        if (element.isPresent()) {
            Document result = documentBuilder.newDocument();
            addExtractedRecordToResultDoc(element.get(), result);

            ByteArrayOutputStream outputStream = removeStylesheet(result);
            record = readRecordFromCleanXml(outputStream);
        }
        return record;
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

    private void addExtractedRecordToResultDoc(Node element, Document result) {
        Node collection = result.createElementNS(MARC_NAMESPACE, COLLECTION_ELEMENT);
        result.appendChild(collection);
        Node node = result.importNode(element, true);
        result.getElementsByTagNameNS(MARC_NAMESPACE, COLLECTION_ELEMENT).item(FIRST_NODE).appendChild(node);
    }

    private Optional<Node> extractFirstMarcRecord(String xml, DocumentBuilder documentBuilder)
            throws SAXException, IOException, XPathExpressionException {
        Document document = parseInputStreamToXmlDoc(xml, documentBuilder);
        return searchForTheFirstMarcRecord(document);
    }

    private Document parseInputStreamToXmlDoc(String xml, DocumentBuilder documentBuilder)
            throws SAXException, IOException {
        Document document = documentBuilder.parse(new InputSource(new StringReader(xml)));
        document.getDocumentElement().normalize();
        return document;
    }

    private Optional<Node> searchForTheFirstMarcRecord(Document document) throws XPathExpressionException {
        XPath xpath = XPathFactory.newInstance().newXPath();
        xpath.setNamespaceContext(new NamespaceResolver(document));
        return Optional.ofNullable((Node) xpath.evaluate(MARC_RECORD_XPATH,
                document.getDocumentElement(),
                XPathConstants.NODE));
    }

    private DocumentBuilder createDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        return documentBuilderFactory.newDocumentBuilder();
    }


    private String parseSRUToLinepresentation(String sruxml) {
        StringBuilder lineFormat = new StringBuilder();
        Document doc = parseSRUXML(sruxml);
        if (doc != null) {
            NodeList leaderNodeList = doc.getElementsByTagName("leader");
            for (int i = 0; i < leaderNodeList.getLength(); i++) {
                Node item = leaderNodeList.item(i);
                String ldr = item.getFirstChild().getNodeValue();
                lineFormat.append("*ldr ").append(ldr).append('\n');
            }
            NodeList controlfieldNodeList = doc.getElementsByTagName("controlfield");
            for (int i = 0; i < controlfieldNodeList.getLength(); i++) {
                Node item = controlfieldNodeList.item(i);
                String controlfield_text = item.getFirstChild().getNodeValue();
                String controlfield_tag = ((Element) item).getAttribute("tag");
                lineFormat.append('*').append(controlfield_tag).append(' ').append(controlfield_text).append('\n');
            }
            NodeList datafieldNodeList = doc.getElementsByTagName("datafield");
            for (int i = 0; i < datafieldNodeList.getLength(); i++) {
                Node item = datafieldNodeList.item(i);
                Element element = (Element) item;
                String datafield_ind1 = element.getAttribute("ind1");
                String datafield_ind2 = element.getAttribute("ind2");
                String datafield_tag = element.getAttribute("tag");
                lineFormat.append('*').append(datafield_tag);
                if (datafield_ind1 != null) {
                    if (" ".equals(datafield_ind1)) {
                        datafield_ind1 = "#";
                    }
                    lineFormat.append(' ').append(datafield_ind1);
                }
                if (datafield_ind2 != null) {
                    if (" ".equals(datafield_ind2)) {
                        datafield_ind2 = "#";
                    }
                    lineFormat.append(' ').append(datafield_ind2);
                }
                NodeList subfieldNodes = element.getElementsByTagName("subfield");
                for (int j = 0; j < subfieldNodes.getLength(); j++) {
                    Element subfieldNode = (Element) subfieldNodes.item(j);
                    String code_tag = subfieldNode.getAttribute("code");
                    String subfieldText = subfieldNode.getTextContent();
                    lineFormat.append(" $").append(code_tag).append(subfieldText);
                }
                lineFormat.append('\n');
            }
        }
        return lineFormat.toString().trim();
    }


    private Document parseSRUXML(String SRUXML) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String removedMarcInSRUXML = SRUXML.replace("marc:", "");
            InputSource is = new InputSource(new StringReader(removedMarcInSRUXML));
            document = builder.parse(is);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Something went wrong during parsing of sruResponse. " + e.getMessage());
        }
        return document;
    }
}
