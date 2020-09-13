package pkg;

import javax.swing.*;

public class ProfessorException extends Exception {

    public ProfessorException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message,
                "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public ProfessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
