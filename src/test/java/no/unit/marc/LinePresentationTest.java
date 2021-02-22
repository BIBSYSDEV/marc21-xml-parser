package no.unit.marc;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

import static no.unit.marc.TestData.LINEPRESENTATION_OF_RECORD;
import static no.unit.marc.TestData.VALID_MARC21_XML_RECORD;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LinePresentationTest {

    public static final String EMPTY_STRING = "";

    /**
     * Stolen from Marc21XmlParser to help test the convertion to linePresentation.
     */
    private Document asDocumentHelperMethod(String sruxml)
            throws ParserConfigurationException, SAXException, IOException {
        Document document;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        String removedMarcInSruXml = sruxml.replace(Marc21Constants.MARC_PREFIX, EMPTY_STRING);
        InputSource is = new InputSource(new StringReader(removedMarcInSruXml));
        document = builder.parse(is);

        return document;
    }

    @Test
    public void testConvertingToLinePresentation() throws ParserConfigurationException, SAXException, IOException {
        LinePresentation linePresentation = new LinePresentation(asDocumentHelperMethod(VALID_MARC21_XML_RECORD));
        assertEquals(LINEPRESENTATION_OF_RECORD, linePresentation.getPresentation());
    }
}