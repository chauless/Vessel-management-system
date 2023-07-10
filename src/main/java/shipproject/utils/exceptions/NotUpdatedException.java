package shipproject.utils.exceptions;

public class NotUpdatedException extends RuntimeException {
    public NotUpdatedException(String msg) {
        super(msg + " hasn't been updated.");
    }
}
