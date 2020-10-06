package by.epam.evm.book.data;

public class NotContainedFieldException extends Exception {

    public NotContainedFieldException() {
    }

    public NotContainedFieldException(String message) {
        super(message);
    }

    public NotContainedFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotContainedFieldException(Throwable cause) {
        super(cause);
    }
}
