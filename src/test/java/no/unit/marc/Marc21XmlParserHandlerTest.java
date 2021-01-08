package no.unit.marc;

import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Marc21XmlParserHandlerTest {

    public static final String SRU_RESPONSE_2_HITS = "/SRU_response_2_hits.xml";
    public static final String MOCK_XML = "<record xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "    <leader>00667caa a2200205 c 4500</leader>\n" +
            "    <controlfield tag=\"001\">991004248644702201</controlfield>\n" +
            "    <controlfield tag=\"005\">20190130103301.0</controlfield>\n" +
            "    <controlfield tag=\"007\">ta</controlfield>\n" +
            "    <controlfield tag=\"008\">100222s2009 xx#||||f||||||000|u|eng|d</controlfield>\n" +
            "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">100424864-47bibsys_network</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"035\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">(NO-TrBIB)100424864</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"040\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">NO-TrBIB</subfield>\n" +
            "        <subfield code=\"b\">nob</subfield>\n" +
            "        <subfield code=\"e\">katreg</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"100\" ind1=\"1\" ind2=\" \">\n" +
            "        <subfield code=\"a\">Gabriel, Ute.</subfield>\n" +
            "        <subfield code=\"4\">aut</subfield>\n" +
            "        <subfield code=\"0\">(NO-TrBIB)8071732</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"245\" ind1=\"1\" ind2=\"0\">\n" +
            "        <subfield code=\"a\">Emotions and legal judgements :</subfield>\n" +
            "        <subfield code=\"b\">normative issues and empirical findings</subfield>\n" +
            "        <subfield code=\"c\">Ute Gabriel</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"260\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"c\">2009</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"300\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">S. 157-172</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"773\" ind1=\"0\" ind2=\" \">\n" +
            "        <subfield code=\"t\">Social psychology of punishment of crime</subfield>\n" +
            "        <subfield code=\"d\">Chichester : Wiley-Blackwell, 2009</subfield>\n" +
            "        <subfield code=\"z\">9780470515990</subfield>\n" +
            "        <subfield code=\"w\">991001073034702201</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"901\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">80</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"914\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">Scientific</subfield>\n" +
            "    </datafield>\n" +
            "    <datafield tag=\"915\" ind1=\" \" ind2=\" \">\n" +
            "        <subfield code=\"a\">1</subfield>\n" +
            "    </datafield>\n" +
            "</record>\n";

    public static final String EXPECTED_MAINTITLE = "Emotions and legal judgements :";

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

        Map<String, String> queryParameters = new HashMap<>();
        event.put(Marc21XmlParserHandler.BODY_KEY, queryParameters);
        result = mockAlmaRecordHandler.handleRequest(event, null);
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), result.getStatusCode());
        assertTrue(result.getBody().contains(Marc21XmlParserHandler.MANDATORY_PARAMETER_XMLRECORD_MISSING));

    }

    @Test
    public void testFetchRecordTitle() {
        Map<String, String> body = new HashMap<>();
        body.put(Marc21XmlParserHandler.XMLRECORD_KEY, MOCK_XML);
        Map<String, Object> event = new HashMap<>();
        event.put(Marc21XmlParserHandler.BODY_KEY, body);

        InputStream stream = RecordParserTest.class.getResourceAsStream(SRU_RESPONSE_2_HITS);
        Marc21XmlParserHandler mockAlmaRecordHandler = new Marc21XmlParserHandler();

        final GatewayResponse gatewayResponse = mockAlmaRecordHandler.handleRequest(event, null);
        assertEquals(Response.Status.OK.getStatusCode(), gatewayResponse.getStatusCode());
        assertTrue(gatewayResponse.getBody().contains(EXPECTED_MAINTITLE));
    }

}
