package shipproject.utils.exceptions;

public class AlreadyAddedToBaseException extends RuntimeException {
    public AlreadyAddedToBaseException(String thatSeaman) {
        super(thatSeaman + " is already added to base.");
    }
}
