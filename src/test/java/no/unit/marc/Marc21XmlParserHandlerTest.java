package no.unit.marc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Marc21XmlParserHandlerTest {

    public static final String MOCK_XML = "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n"
            + "    <leader>00667caa a2200205 c 4500</leader>\n"
            + "    <controlfield tag=\"001\">991004248644702201</controlfield>\n"
            + "    <controlfield tag=\"005\">20190130103301.0</controlfield>\n"
            + "    <controlfield tag=\"007\">ta</controlfield>\n"
            + "    <controlfield tag=\"008\">100222s2009 xx#||||f||||||000|u|eng|d</controlfield>\n"
            + "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">100424864-47bibsys_network</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">(NO-TrBIB)100424864</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"040\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">NO-TrBIB</subfield>\n"
            + "        <subfield code=\"b\">nob</subfield>\n"
            + "        <subfield code=\"e\">katreg</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"100\" ind1=\"1\" ind2=\" \">\n"
            + "        <subfield code=\"a\">Gabriel, Ute.</subfield>\n"
            + "        <subfield code=\"4\">aut</subfield>\n"
            + "        <subfield code=\"0\">(NO-TrBIB)8071732</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"245\" ind1=\"1\" ind2=\"0\">\n"
            + "        <subfield code=\"a\">Emotions and legal judgements :</subfield>\n"
            + "        <subfield code=\"b\">normative issues and empirical findings</subfield>\n"
            + "        <subfield code=\"c\">Ute Gabriel</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"260\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"c\">2009</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"300\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">S. 157-172</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"773\" ind1=\"0\" ind2=\" \">\n"
            + "        <subfield code=\"t\">Social psychology of punishment of crime</subfield>\n"
            + "        <subfield code=\"d\">Chichester : Wiley-Blackwell, 2009</subfield>\n"
            + "        <subfield code=\"z\">9780470515990</subfield>\n"
            + "        <subfield code=\"w\">991001073034702201</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"901\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">80</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"914\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">Scientific</subfield>\n"
            + "    </datafield>\n"
            + "    <datafield tag=\"915\" ind1=\" \" ind2=\" \">\n"
            + "        <subfield code=\"a\">1</subfield>\n"
            + "    </datafield>\n"
            + "</record>";

    private static final String EXPECTED_MAINTITLE = "Emotions and legal judgements :";
    private static final String EXPECTED_AUTHOR = "Fisher, Jude";

    private static final String MOCK_AUTHOR_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<record xmlns:marc=\"info:lc/xmlns/marcxchange-v1\" format=\"MARC21\" id=\"1093967\" type=\"Authority\">\n" +
            "    <leader>99999nz  a2299999n  4500</leader>\n" +
            "    <controlfield tag=\"001\">1093967</controlfield>\n" +
            "    <controlfield tag=\"003\">NO-TrBIB</controlfield>\n" +
            "    <controlfield tag=\"005\">20200219154815.0</controlfield>\n" +
            "    <controlfield tag=\"008\">141210n| adz|naabn|         |a|ana|     </controlfield>\n" +
            "    <datafield ind1=\"7\" ind2=\" \" tag=\"024\">\n" +
            "        <subfield code=\"a\">x01093967</subfield>\n" +
            "        <subfield code=\"2\">NO-TrBIB</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"7\" ind2=\" \" tag=\"024\">\n" +
            "        <subfield code=\"a\">http://hdl.handle.net/11250/435017</subfield>\n" +
            "        <subfield code=\"2\">hdl</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"7\" ind2=\" \" tag=\"024\">\n" +
            "        <subfield code=\"a\">0000000120242072</subfield>\n" +
            "        <subfield code=\"2\">isni</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"7\" ind2=\" \" tag=\"024\">\n" +
            "        <subfield code=\"a\">http://viaf.org/viaf/38828338</subfield>\n" +
            "        <subfield code=\"2\">viaf</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"7\" ind2=\" \" tag=\"024\">\n" +
            "        <subfield code=\"a\">80683</subfield>\n" +
            "        <subfield code=\"2\">bibbi</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "        <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "        <subfield code=\"b\">nob</subfield>\n" +
            "        <subfield code=\"c\">NO-TrBIB</subfield>\n" +
            "        <subfield code=\"f\">noraf</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "        <subfield code=\"a\">Fisher, Jude</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\" \" ind2=\" \" tag=\"386\">\n" +
            "        <subfield code=\"a\">eng.</subfield>\n" +
            "        <subfield code=\"m\">Nasjonalitet/regional gruppe</subfield>\n" +
            "        <subfield code=\"2\">bs-nasj</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\"1\" ind2=\" \" tag=\"500\">\n" +
            "        <subfield code=\"a\">Johnson, Jane</subfield>\n" +
            "        <subfield code=\"d\">1960-</subfield>\n" +
            "        <subfield code=\"0\">(NO-TrBIB)14068295</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\" \" ind2=\" \" tag=\"667\">\n" +
            "        <subfield code=\"a\">Psevdonym for Jane Johnson</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield ind1=\" \" ind2=\" \" tag=\"901\">\n" +
            "        <subfield code=\"a\">kat3</subfield>\n" +
            "    </datafield>\n" +
            "</record>";


    @Test
    public void testFetchRecord_MissingBody() {

        Marc21XmlParserHandler mockAlmaRecordHandler = new Marc21XmlParserHandler();
        GatewayResponse result = mockAlmaRecordHandler.handleRequest(null, null);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), result.getStatusCode());
        assertTrue(result.getBody().contains(Marc21XmlParserHandler.MISSING_EVENT_ELEMENT_BODY));

        Map<String, Object> event = new HashMap<>();
        result = mockAlmaRecordHandler.handleRequest(event, null);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), result.getStatusCode());
        assertTrue(result.getBody().contains(Marc21XmlParserHandler.MISSING_EVENT_ELEMENT_BODY));

        event.put(Marc21XmlParserHandler.BODY_KEY, null);
        result = mockAlmaRecordHandler.handleRequest(event, null);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), result.getStatusCode());
        assertTrue(result.getBody().contains(Marc21XmlParserHandler.MISSING_EVENT_ELEMENT_BODY));

    }

    @Test
    public void testFetchRecordTitle() {
        String simpleQuoted = StringUtils.replace(MOCK_XML, "\"", "'");
        String noLineFeeds = StringUtils.replace(simpleQuoted, "\n", "");
        String mockBody = "{\"" + Marc21XmlParserHandler.XMLRECORD_KEY + "\": \"" + noLineFeeds + "\"}";
        Map<String, Object> event = new HashMap<>();
        event.put(Marc21XmlParserHandler.BODY_KEY, mockBody);

        Marc21XmlParserHandler mockAlmaRecordHandler = new Marc21XmlParserHandler();

        final GatewayResponse gatewayResponse = mockAlmaRecordHandler.handleRequest(event, null);
        assertEquals(Response.Status.OK.getStatusCode(), gatewayResponse.getStatusCode());
        assertTrue(gatewayResponse.getBody().contains(EXPECTED_MAINTITLE));
    }

    @Test
    public void testFetchAuthor() {
        String simpleQuoted = StringUtils.replace(MOCK_AUTHOR_XML, "\"", "'");
        String noLineFeeds = StringUtils.replace(simpleQuoted, "\n", "");
        String mockBody = "{\"" + Marc21XmlParserHandler.XMLRECORD_KEY + "\": \"" + noLineFeeds + "\"}";
        Map<String, Object> event = new HashMap<>();
        event.put(Marc21XmlParserHandler.BODY_KEY, mockBody);

        Marc21XmlParserHandler marc21XmlParserHandler = new Marc21XmlParserHandler();

        final GatewayResponse gatewayResponse = marc21XmlParserHandler.handleRequest(event, null);
        assertEquals(Response.Status.OK.getStatusCode(), gatewayResponse.getStatusCode());
        assertTrue(gatewayResponse.getBody().contains(EXPECTED_AUTHOR));
        JsonObject jsonObject = JsonParser.parseString(gatewayResponse.getBody()).getAsJsonObject();
        JsonElement authors = jsonObject.get("authors");
        assertEquals(EXPECTED_AUTHOR, authors.getAsJsonArray().get(0).getAsString());
    }

}
