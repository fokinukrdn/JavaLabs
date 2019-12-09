package lab3.ua.procamp.exception;
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}