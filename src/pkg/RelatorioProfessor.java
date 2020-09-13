package pkg;

import javax.swing.*;

public class RelatorioProfessor {
    public void imprimirFolha(Professor professor) {
        JOptionPane.showMessageDialog(null, professor,
                "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);
    }
}
