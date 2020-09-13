package pkg;

import javax.swing.*;
import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String area;
    private ArrayList<Professor> listaProfessor;

    public Departamento(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public void adicionarProfessor(Professor professor) {
        listaProfessor.add(professor);
    }

    public void removerProfessor(Professor professor) {
        listaProfessor.remove(professor);
    }

    public void imprimirListaProfessores() {
        JOptionPane.showMessageDialog(null, listaProfessor,
                "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);
    }
}
