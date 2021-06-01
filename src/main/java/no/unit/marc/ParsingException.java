package no.unit.marc;

public class ParsingException extends Exception {
    public ParsingException(String message, Exception e) {
        super(message, e);
    }
}
