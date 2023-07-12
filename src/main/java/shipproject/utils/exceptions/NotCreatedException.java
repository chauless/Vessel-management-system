package shipproject.utils.exceptions;

    public class NotCreatedException extends RuntimeException {

        public NotCreatedException(String msg) {
            super(msg + " hasn't been created after request");
        }
}
