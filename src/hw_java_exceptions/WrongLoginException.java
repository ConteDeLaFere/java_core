package hw_java_exceptions;

public class WrongLoginException extends IllegalArgumentException {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String s) {
        super(s);
    }

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginException(Throwable cause) {
        super(cause);
    }
}
