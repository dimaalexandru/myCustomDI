package ro.alex.di.core.exceptions;

/**
 * User: Alexandru.Dima
 * Date: 11/12/13
 * Time: 8:48 PM
 */
public class InvalidConfigurationClassException extends MyCustomDiException {

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public InvalidConfigurationClassException() {
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public InvalidConfigurationClassException(String message) {
        super(message);
    }

}
