package no.unit.marc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;


public class ConfigTest {

    @Test
    public void testCorsHeaderNotSet() {
        final Config config = Config.getInstance();
        config.setCorsHeader(null);
        final String corsHeader = config.getCorsHeader();
        assertNull(corsHeader);
    }

}
