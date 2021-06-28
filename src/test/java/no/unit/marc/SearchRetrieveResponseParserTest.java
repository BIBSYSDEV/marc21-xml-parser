package no.unit.marc;

import org.junit.jupiter.api.Test;
import org.marc4j.marc.DataField;
import org.marc4j.marc.MarcFactory;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;
import org.w3c.dom.Document;

import java.util.List;

import static no.unit.marc.TestData.VALID_SEARCH_RETRIVE_RESPONSE;
import static no.unit.marc.TestData.TEST_DATA_2;
import static no.unit.marc.TestData.SEARCH_RETRIEVE_RESPONSE_THREE_HITS;
import static no.unit.marc.TestData.SRR_ONE_HIT_ID;
import static no.unit.marc.TestData.SRR_ONE_HIT_MAIN_TITLE;
import static no.unit.marc.TestData.SRR_ONE_HIT_YEAR;
import static no.unit.marc.TestData.SRR_THREE_HITS_CORRECT_ID_1;
import static no.unit.marc.TestData.SRR_THREE_HITS_CORRECT_ID_2;
import static no.unit.marc.TestData.SRR_THREE_HITS_ISBN;
import static no.unit.marc.TestData.SEARCH_RETRIEVE_RESPONSE_ONE_HIT;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SearchRetrieveResponseParserTest {

    @Test
    void throwsParsingExceptionWhenXmlIsInvalid() {
        assertThrows(ParsingException.class, () -> SearchRetrieveResponseParser
                .getReferenceObjectsFromSearchRetrieveResponse(TestData.BAD_XML));
    }

    @Test
    void getsOnlyCorrectRecordsFromIsbn() throws ParsingException {
        List<Reference> referenceObjects = SearchRetrieveResponseParser
                .getReferenceObjectsFromSearchRetrieveResponseWithCorrectIsbn(
                        SEARCH_RETRIEVE_RESPONSE_THREE_HITS, SRR_THREE_HITS_ISBN);

        assertEquals(2, referenceObjects.size());
        assertEquals(SRR_THREE_HITS_CORRECT_ID_1, referenceObjects.get(0).getId());
        assertEquals(SRR_THREE_HITS_CORRECT_ID_2, referenceObjects.get(1).getId());
    }

    @Test
    void getsCorrectReferenceObjectValues() throws ParsingException {
        List<Reference> referenceObjects = SearchRetrieveResponseParser
                .getReferenceObjectsFromSearchRetrieveResponse(SEARCH_RETRIEVE_RESPONSE_ONE_HIT);

        assertEquals(1, referenceObjects.size());
        assertEquals(SRR_ONE_HIT_ID, referenceObjects.get(0).getId());
        assertEquals(SRR_ONE_HIT_MAIN_TITLE, referenceObjects.get(0).getMainTitle());
        assertEquals(SRR_ONE_HIT_YEAR, referenceObjects.get(0).getYear());
    }

    /**
     * This fails unless you add a number to make sure the second "leader" tag is 24 chars long.
     * Why dont the others fail for that same reason?
     * use 1449345379 as the isbn corresponding to the record.
     * The isbn13 version is 9781449345372.
     * None of the above give results in from the alma-sru-proxy.
     * Use 1-4493-4537-9 to get a response.
     * @throws Exception When something fails.
     */
    @Test
    void gettingCorrectReferenceWithHyphendIsbn() throws Exception {
        List<Reference> referenceObjects = SearchRetrieveResponseParser
                .getReferenceObjectsFromSearchRetrieveResponseWithCorrectIsbn(VALID_SEARCH_RETRIVE_RESPONSE,
                        "14-49-34-535-2");
        for (Reference ref: referenceObjects) {
            System.out.println(ref.getId());
        }
    }

    @Test
    void howManyRecordsInDoc() throws Exception {
        List<Document> nodeDocs = SearchRetrieveResponseParser.getMarcFriendlyDocuments(TEST_DATA_2);
    }

    @Test
    public void testDataFieldHasCorrectIsbnInSubfield_A() {
        Subfield subfield = MarcFactory.newInstance().newSubfield(SearchRetrieveResponseParser.MARC_CODE_A);
        subfield.setData("978-82-02-54212-2");
        DataField dataField = MarcFactory.newInstance().newDataField(
                SearchRetrieveResponseParser.MARC_TAG_020,' ', ' ');
        dataField.addSubfield(subfield);
        String isbn = "9788202542122";
        assertTrue(SearchRetrieveResponseParser.theDataFieldHasCorrectIsbnInSubfield(dataField, isbn));
    }

    @Test
    public void testDataFieldHasCorrectIsbnInSubfield_Z() {
        Subfield subfield = MarcFactory.newInstance().newSubfield(SearchRetrieveResponseParser.MARC_CODE_Z);
        subfield.setData("978-82-02-54212-2");
        DataField dataField = MarcFactory.newInstance().newDataField(
                SearchRetrieveResponseParser.MARC_TAG_020,' ', ' ');
        dataField.addSubfield(subfield);
        String isbn = "9788202542122";
        assertTrue(SearchRetrieveResponseParser.theDataFieldHasCorrectIsbnInSubfield(dataField, isbn));
    }
}
