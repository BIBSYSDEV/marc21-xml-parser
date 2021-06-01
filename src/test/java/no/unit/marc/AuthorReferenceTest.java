package no.unit.marc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorReferenceTest {
    public static final String MOCK_NAME = "HELGE INGSTAD";
    public static final String MOCK_DATE = "15.02.21";
    public static final String MOCK_ID = "01";
    public static final AuthorReference MOCK_AUTHOR = new AuthorReference(MOCK_NAME, MOCK_DATE, MOCK_ID);

    @Test
    void testGetName() {
        assertEquals(MOCK_NAME, MOCK_AUTHOR.getName());
    }

    @Test
    void testGetDate() {
        assertEquals(MOCK_DATE, MOCK_AUTHOR.getDate());
    }

    @Test
    void testGetId() {
        assertEquals(MOCK_ID, MOCK_AUTHOR.getId());
    }
}