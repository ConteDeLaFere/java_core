package hw_java_exceptions;

public class WrongPasswordException extends IllegalArgumentException {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String s) {
        super(s);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordException(Throwable cause) {
        super(cause);
    }
}
