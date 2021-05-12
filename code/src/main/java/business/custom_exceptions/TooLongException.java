package business.custom_exceptions;

public class TooLongException extends RuntimeException {
    public TooLongException(String exception) {
        super(exception);
    }
}
