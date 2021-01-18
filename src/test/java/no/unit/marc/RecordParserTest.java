package no.unit.marc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.marc4j.MarcException;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RecordParserTest {

    public static final String SRU_RESPONSE_WITH_SUBTITLE = "/SRU_response_with_subtitle.xml";
    public static final String SRU_RESPONSE_END_TRUNCATED = "/SRU_response_truncated.xml";
    public static final String SRU_RESPONSE_START_TRUNCATED = "/SRU_response_top_truncated.xml";
    public static final String SRU_RESPONSE_ZERO_HITS = "/SRU_zero_hits.xml";
    public static final String EXPECTED_TITLE = "Emotions and legal judgements :";
    public static final String EXPECTED_PARALLELTITLE = "normative issues and empirical findings";


    @Test
    public void testExtractPublicationTitle() throws IOException, TransformerException {
        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_WITH_SUBTITLE);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        RecordParser recordParser = new RecordParser();
        Reference reference = recordParser.parse(xml);
        assertTrue(reference.getMainTitle().contains(EXPECTED_TITLE));
    }

    @Test
    public void testExtractPublicationSubtitle() throws IOException, TransformerException {
        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_WITH_SUBTITLE);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        RecordParser recordParser = new RecordParser();
        Reference reference = recordParser.parse(xml);
        assertTrue(reference.getParalleltitle().contains(EXPECTED_PARALLELTITLE));
    }

    @Test
    public void testExtractPublicationTitle_FromZeroHits() throws IOException, TransformerException {
        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_ZERO_HITS);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        RecordParser recordParser = new RecordParser();
        Reference reference = recordParser.parse(xml);
        assertNull(reference.getMainTitle());
    }

    @Test
    public void testExtractPublicationTitle_MalformedSruResponseOnEnd() throws IOException {
        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_END_TRUNCATED);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        RecordParser recordParser = new RecordParser();
        Assertions.assertThrows(MarcException.class, () -> recordParser.parse(xml));
    }

    @Test
    public void testExtractPublicationTitle_MalformedSruResponseOnStart() throws IOException {
        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_START_TRUNCATED);
        String xml = IOUtils.toString(stream, StandardCharsets.UTF_8);
        RecordParser recordParser = new RecordParser();
        Assertions.assertThrows(MarcException.class, () -> recordParser.parse(xml));
    }
}
