package pkg;

import javax.swing.*;

public class DepartamentoException extends Exception {

    public DepartamentoException(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message,
                "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public DepartamentoException(String message, Throwable cause) {
        super(message, cause);
    }
}
