package no.unit.marc.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StringUtilsTest {

    public static final String MOCK_EMPTY_STRING = "";
    public static final String MOCK_NOT_EMPTY_STRING = "This is not an empty string";

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(MOCK_EMPTY_STRING));
        assertFalse(StringUtils.isEmpty((MOCK_NOT_EMPTY_STRING)));
    }

    @Test
    void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(MOCK_EMPTY_STRING));
        assertTrue(StringUtils.isNotEmpty((MOCK_NOT_EMPTY_STRING)));
    }
}