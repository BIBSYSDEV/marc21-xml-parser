package no.unit.marc;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AlmaRecordParserTest {

    public static final String SRU_RESPONSE_2_HITS = "/SRU_response_2_hits.xml";
    public static final String SRU_RESPONSE_WITH_SUBTITLE = "/SRU_response_with_subtitle.xml";
    public static final String SRU_RESPONSE_END_TRUNCATED = "/SRU_response_truncated.xml";
    public static final String SRU_RESPONSE_START_TRUNCATED = "/SRU_response_top_truncated.xml";
    public static final String SRU_RESPONSE_ZERO_HITS = "/SRU_zero_hits.xml";
    public static final String EXPECTED_TITLE = "Bedriftsintern telekommunikasjon";
    public static final String EXPECTED_SUBTITLE =
            "Emotions and legal judgements : normative issues and empirical findings";


    @Ignore
    @Test
    public void testExtractPublicationTitle() throws IOException, ParserConfigurationException, TransformerException,
            SAXException, XPathExpressionException {
        InputStream stream = AlmaRecordParserTest.class.getResourceAsStream(SRU_RESPONSE_2_HITS);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        AlmaRecordParser almaRecordParser = new AlmaRecordParser();
        Reference reference = almaRecordParser.extractPublicationTitle(xml);
        assertTrue(reference.getTitle().contains(EXPECTED_TITLE));
    }
    @Ignore
    @Test
    public void testExtractPublicationSubtitle() throws IOException, ParserConfigurationException, TransformerException,
            SAXException, XPathExpressionException {
        InputStream stream = AlmaRecordParserTest.class.getResourceAsStream(SRU_RESPONSE_WITH_SUBTITLE);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        AlmaRecordParser almaRecordParser = new AlmaRecordParser();
        Reference reference = almaRecordParser.extractPublicationTitle(xml);
        assertTrue(reference.getTitle().contains(EXPECTED_SUBTITLE));
    }
    @Ignore
    @Test
    public void testExtractPublicationTitle_FromZeroHits() throws IOException, ParserConfigurationException,
            TransformerException, SAXException, XPathExpressionException {
        InputStream stream = AlmaRecordParserTest.class.getResourceAsStream(SRU_RESPONSE_ZERO_HITS);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        AlmaRecordParser almaRecordParser = new AlmaRecordParser();
        Reference reference = almaRecordParser.extractPublicationTitle(xml);
        assertNull(reference.getTitle());
    }
    @Ignore
    @Test
    public void testExtractPublicationTitle_MalformedSruResponseOnEnd() throws IOException {
        InputStream stream = AlmaRecordParserTest.class.getResourceAsStream(SRU_RESPONSE_END_TRUNCATED);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        AlmaRecordParser almaRecordParser = new AlmaRecordParser();
        Assertions.assertThrows(SAXException.class, () -> almaRecordParser.extractPublicationTitle(xml));
    }
    @Ignore
    @Test
    public void testExtractPublicationTitle_MalformedSruResponseOnStart() throws IOException {
        InputStream stream = AlmaRecordParserTest.class.getResourceAsStream(SRU_RESPONSE_START_TRUNCATED);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        AlmaRecordParser almaRecordParser = new AlmaRecordParser();
        Assertions.assertThrows(SAXException.class, () -> almaRecordParser.extractPublicationTitle(xml));
    }
}
