package shipproject.utils.exceptions;

public class ListIsEmptyException extends RuntimeException {
    public ListIsEmptyException(String desc) {
        super("List of " + desc + " is empty, please check your request");
    }
}
