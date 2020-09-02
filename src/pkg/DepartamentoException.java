package pkg;

public class DepartamentoException extends Exception {
    public DepartamentoException() {
    }

    public DepartamentoException(String message) {
        super(message);
    }

    public DepartamentoException(String message, Throwable cause) {
        super(message, cause);
    }
}
