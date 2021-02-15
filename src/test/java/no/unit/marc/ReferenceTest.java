package no.unit.marc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceTest {

    public static final String MOCK_ID = "1234";
    public static final String MOCK_ISBN_1 = "2345";
    public static final String MOCK_ISBN_2 = "3456";
    public static final String MOCK_ISBN_3 = "4567";
    public static final List<String> MOCK_ISBN_LIST = new ArrayList<String>(){
        {
            add(MOCK_ISBN_1);
            add(MOCK_ISBN_2);
            add(MOCK_ISBN_3);
        }};
    public static final String MOCK_ISSN_1 = "2345";
    public static final String MOCK_ISSN_2 = "3456";
    public static final String MOCK_ISSN_3 = "4567";
    public static final List<String> MOCK_ISSN_LIST = new ArrayList<String>(){
        {
            add(MOCK_ISSN_1);
            add(MOCK_ISSN_2);
            add(MOCK_ISSN_3);
        }};

    @Test
    public void testGetMethodsFromReference() {
        /** Test ID */
        Reference reference = new Reference();
        reference.setId(MOCK_ID);
        assertEquals(MOCK_ID, reference.getId());

        /** Test ISBN */
        reference.addIsbn(MOCK_ISBN_1);
        reference.addIsbn(MOCK_ISBN_2);
        reference.addIsbn(MOCK_ISBN_3);
        assertEquals(MOCK_ISBN_LIST, reference.getIsbn());

        /** Test ISSN */
        reference.addIssn(MOCK_ISSN_1);
        reference.addIssn(MOCK_ISSN_2);
        reference.addIssn(MOCK_ISSN_3);
        assertEquals(MOCK_ISSN_LIST, reference.getIssn());
    }

}