package pkg;

import javax.swing.*;

public class RelatorioProfessor {
    public void imprimirFolha(Professor professor) {
        try {
            JOptionPane.showMessageDialog(null,
                    "Nome: " + professor.getNome() +
                            "\nTitulação: " + professor.getTitulacao() +
                            "\nMatricula: " + professor.getMatricula() +
                            "\nSalário: " + professor.calcularSalario(),
                    "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);

        } catch (ProfessorException e) {
            e.printStackTrace();
            System.exit(6);
        }
    }
}
