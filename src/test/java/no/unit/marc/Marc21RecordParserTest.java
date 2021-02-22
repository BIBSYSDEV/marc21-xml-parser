package no.unit.marc;

import org.junit.jupiter.api.Test;

import static no.unit.marc.TestData.INVALID_MARC21_XML_RECORD;
import static no.unit.marc.TestData.VALID_MARC21_XML_RECORD;
import static no.unit.marc.TestData.VALID_MARC21_XML_RECORD_ID;
import static no.unit.marc.TestData.VALID_MARC21_XML_RECORD_TITLE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Marc21RecordParserTest {

    @Test
    public void testXmlNotStartingWithRecordTag() {
        String recordWithWrongRootElement = "<recordData>" + VALID_MARC21_XML_RECORD + "</recordData>";
        assertThrows(Marc21XmlParserException.class, () -> {
            Marc21RecordParser.getReferenceObjectFromMarc21XmlRecord(recordWithWrongRootElement);
        });
    }

    @Test
    public void testXmlContainingErrors() {
        assertThrows(Marc21XmlParserException.class, () -> {
            Marc21RecordParser.getReferenceObjectFromMarc21XmlRecord(INVALID_MARC21_XML_RECORD);
        });
    }

    @Test
    public void testParsing() throws Marc21XmlParserException {
        Reference reference = Marc21RecordParser.getReferenceObjectFromMarc21XmlRecord(VALID_MARC21_XML_RECORD);
        assertEquals(VALID_MARC21_XML_RECORD_ID, reference.getId());
        assertEquals(VALID_MARC21_XML_RECORD_TITLE, reference.getMainTitle());
    }
}