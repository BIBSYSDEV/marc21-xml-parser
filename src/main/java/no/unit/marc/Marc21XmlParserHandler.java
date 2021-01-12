package no.unit.marc;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.xml.sax.SAXException;

import javax.ws.rs.core.Response;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Marc21XmlParserHandler implements RequestHandler<Map<String, Object>, GatewayResponse> {

    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "An error occurred, error has been logged";
    public static final String MISSING_EVENT_ELEMENT_BODY = "Missing event element 'body'.";
    public static final String MANDATORY_PARAMETER_XMLRECORD_MISSING = "Mandatory parameter 'xmlRecord' is missing.";
    public static final String MANDATORY_PARAMETER_XMLRECORD_EMPTY = "Mandatory parameter 'xmlRecord' is empty.";
    public static final String BODY_KEY = "body";
    public static final String XMLRECORD_KEY = "xmlRecord";

    /**
     * Main lambda function to parse marc21-xml records.
     *
     * @param input payload marc21-xml record
     * @return a GatewayResponse
     */
    @Override
    @SuppressWarnings("unchecked")
    public GatewayResponse handleRequest(final Map<String, Object> input, Context context) {
        System.out.println(input);
        GatewayResponse gatewayResponse = new GatewayResponse();
        try {
            this.checkParameters(input);
        } catch (MissingParameterException e) {
            String exception = DebugUtils.dumpException(e);
            System.out.println(exception);
            gatewayResponse.setErrorBody(e.getMessage()); // Exception contains missing parameter name
            gatewayResponse.setStatusCode(Response.Status.BAD_REQUEST.getStatusCode());
            return gatewayResponse;
        }

        String bodyEvent = (String) input.get(BODY_KEY);
        JsonObject convertedObject = new Gson().fromJson(bodyEvent, JsonObject.class);
        JsonElement xmlElement = convertedObject.get(XMLRECORD_KEY);
        String xml = xmlElement.getAsString();        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            RecordParser recordParser = new RecordParser();
            Reference reference = recordParser.parse(xml);
            gatewayResponse.setBody(gson.toJson(reference, Reference.class));
            gatewayResponse.setStatusCode(Response.Status.OK.getStatusCode());
        } catch (IOException | TransformerException | SAXException | ParserConfigurationException
                | XPathExpressionException e) {
            DebugUtils.dumpException(e);
            gatewayResponse.setErrorBody(INTERNAL_SERVER_ERROR_MESSAGE);
            gatewayResponse.setStatusCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        }
        return gatewayResponse;
    }

    private void checkParameters(Map<String, Object> input) {
        if (Objects.isNull(input) || !input.containsKey(BODY_KEY)
                || Objects.isNull(input.get(BODY_KEY))) {
            throw new MissingParameterException(MISSING_EVENT_ELEMENT_BODY);
        }
        String eventBody = (String) input.get(BODY_KEY);
        System.out.println("body is here: " + eventBody);
        JsonObject convertedObject = new Gson().fromJson(eventBody, JsonObject.class);
        System.out.println("gson object is here: " + convertedObject.toString());
        JsonElement jsonElement = convertedObject.get(XMLRECORD_KEY);
        if (Objects.isNull(jsonElement) || !jsonElement.isJsonPrimitive()) {
            throw new MissingParameterException(MANDATORY_PARAMETER_XMLRECORD_MISSING);
        } else {
            String recordXML = jsonElement.getAsString();
            if (StringUtils.isEmpty(recordXML)) {
                throw new MissingParameterException(MANDATORY_PARAMETER_XMLRECORD_EMPTY);
            }
        }
    }

}
