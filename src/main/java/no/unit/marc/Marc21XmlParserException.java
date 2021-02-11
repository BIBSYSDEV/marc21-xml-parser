package no.unit.marc;

public class Marc21XmlParserException extends Exception{

    public Marc21XmlParserException(String errorString, Exception e) {
        super(errorString, e);
    };

    public  Marc21XmlParserException(String errorString) { super(errorString); };
}
