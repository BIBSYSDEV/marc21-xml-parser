package no.unit.marc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static no.unit.marc.TestData.SEARCH_RETRIEVE_RESPONSE_ONE_HIT;
import static no.unit.marc.TestData.SRR_ONE_HIT_ID;
import static no.unit.marc.TestData.SRR_ONE_HIT_MAIN_TITLE;
import static no.unit.marc.TestData.SRR_ONE_HIT_YEAR;
import static no.unit.marc.TestData.SRR_THREE_HITS_CORRECT_ID_1;
import static no.unit.marc.TestData.SRR_THREE_HITS_CORRECT_ID_2;
import static no.unit.marc.TestData.SRR_THREE_HITS_ISBN;
import static no.unit.marc.TestData.SEARCH_RETRIEVE_RESPONSE_THREE_HITS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
}
