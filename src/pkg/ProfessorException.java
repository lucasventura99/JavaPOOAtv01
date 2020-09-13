package pkg;

public class ProfessorException extends Exception {

    public ProfessorException(String message) {
        super(message);
    }

    public ProfessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
