package no.unit.marc;

public class MissingParameterException extends RuntimeException {

    public MissingParameterException(String parameterMissing) {
        super(parameterMissing);
    }
}
