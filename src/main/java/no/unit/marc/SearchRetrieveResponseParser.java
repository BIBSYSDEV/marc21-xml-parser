package no.unit.marc;

import no.unit.marc.utils.DocumentBuilderCreator;
import org.marc4j.MarcXmlReader;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static no.unit.marc.Marc21RecordParser.getReferenceObjectFromMarc21XmlRecord;

public class SearchRetrieveResponseParser {

    public static final String MARC_PREFIX = "marc:";
    public static final String MARC_TAG_020 = "020";
    public static final char MARC_CODE_A = 'a';
    public static final char MARC_CODE_Z = 'z';

    /**
     * Get reference objects from searchRetrieveResponse.
     *
     * @param xml XML as String. Must have format of searchRetrieveResponse from alma.
     * @return List of records as Reference objects
     * @throws ParsingException When there are errors during parsing to XML and Marc21-objects
     */
    public static List<Reference> getReferenceObjectsFromSearchRetrieveResponse(String xml) throws ParsingException {
        try {
            List<Reference> referenceObjects = new ArrayList<>();
            for (Document marcFriendlyDocument : getMarcFriendlyDocuments(xml)) {
                referenceObjects.add(getReferenceObjectFromMarc21XmlRecord(nodeToString(marcFriendlyDocument)));
            }
            return referenceObjects;
        } catch (ParserConfigurationException | SAXException | IOException
                | TransformerException | XPathExpressionException | Marc21XmlParserException e) {
            throw new ParsingException("Could not parse xml to marc21 data", e);
        }
    }

    /**
     * Get reference objects from searchRetrieveResponse which has given ISBN in field 020$a.
     *
     * @param xml  XML as String. Must have format of searchRetrieveResponse from alma
     * @param isbn ISBN which records will be filtered for
     * @return List of records as Reference objects
     * @throws ParsingException When there are errors during parsing to XML and Marc21-objects
     */
    public static List<Reference> getReferenceObjectsFromSearchRetrieveResponseWithCorrectIsbn(String xml, String isbn)
            throws ParsingException {
        try {
            List<Reference> referenceObjects = new ArrayList<>();
            System.out.println("Number of records: " + getMarcFriendlyDocuments(xml).size());
            for (Document marcFriendlyDocument : getMarcFriendlyDocuments(xml)) {
                Record record = asMarcRecords(marcFriendlyDocument).next();
                for (DataField dataField : record.getDataFields()) {
                    String datafieldTag = dataField.getTag();
                    if (MARC_TAG_020.equals(datafieldTag) && theDataFieldHasCorrectIsbnInSubfield(dataField, isbn)) {
                        referenceObjects.add(getReferenceObjectFromMarc21XmlRecord(nodeToString(marcFriendlyDocument)));
                    }
                }
            }
            return referenceObjects;
        } catch (ParserConfigurationException | SAXException | IOException
                | TransformerException | XPathExpressionException | Marc21XmlParserException e) {
            throw new ParsingException("Could not parse xml to marc21 data", e);
        }
    }

    protected static List<Document> getMarcFriendlyDocuments(String xml)
            throws XPathExpressionException,
            ParserConfigurationException,
            IOException,
            SAXException {
        DocumentBuilder builder = DocumentBuilderCreator.createSecureDocumentBuilder();
        String removedMarcInSruXml = xml.replace(MARC_PREFIX, "");
        String removedSpaceBetweenElements = removedMarcInSruXml.replaceAll(">[\\s\r\n]*<", "><");
        InputSource is = new InputSource(new StringReader(removedSpaceBetweenElements));
        Document document = builder.parse(is);

        XPath path = XPathFactory.newInstance().newXPath();
        NodeList recordsNodes = (NodeList) path.compile("searchRetrieveResponse/records")
                .evaluate(document, XPathConstants.NODE);

        List<Document> marcFriendlyDocuments = new ArrayList<>();
        for (int i = 0; recordsNodes.getLength() > i; i++) {
            Node recordNode = (Node) path.compile("recordData/record")
                    .evaluate(recordsNodes.item(i), XPathConstants.NODE);
            marcFriendlyDocuments.add(transformNodeToNewDocument(builder, recordNode));
        }
        return marcFriendlyDocuments;
    }

    private static Document transformNodeToNewDocument(DocumentBuilder builder, Node recordNode) {
        Document document = builder.newDocument();
        Node importedNode = document.importNode(recordNode, true);
        document.appendChild(importedNode);
        return document;
    }

    private static MarcXmlReader asMarcRecords(Document doc) throws TransformerException {
        ByteArrayOutputStream outputStream = removeStylesheet(doc);
        return new MarcXmlReader(new ByteArrayInputStream(outputStream.toByteArray()));
    }

    private static boolean theDataFieldHasCorrectIsbnInSubfield(DataField dataField, String isbn) {
        boolean isbnFound = false;
        Subfield subfieldA = dataField.getSubfield(MARC_CODE_A);
        Subfield subfieldZ = dataField.getSubfield(MARC_CODE_Z);
        if (subfieldA != null) {
            isbnFound = lookForMatchingIsbn(subfieldA, isbn);
        } else if (subfieldZ != null) {
            isbnFound = lookForMatchingIsbn(subfieldZ, isbn);
        }
        return isbnFound;
    }

    private static boolean lookForMatchingIsbn(Subfield subfield, String isbn) {
        String isbnFromDataField = subfield.getData().replace("-", "");
        System.out.println("Isbn found on record: " + isbnFromDataField);
        String strippedIsbn = isbn.replace("-", "");
        return isbnFromDataField.contains(strippedIsbn);
    }

    private static String nodeToString(Node node) throws TransformerException {
        StringWriter buf = new StringWriter();
        Transformer xform = TransformerFactory.newInstance().newTransformer();
        xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        xform.setOutputProperty(OutputKeys.INDENT, "yes");
        xform.transform(new DOMSource(node), new StreamResult(buf));
        return buf.toString();
    }

    private static ByteArrayOutputStream removeStylesheet(Document result) throws TransformerException {
        Source source = new DOMSource(result);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Result outputTarget = new StreamResult(outputStream);
        TransformerFactory.newInstance().newTransformer().transform(source, outputTarget);
        return outputStream;
    }

}
