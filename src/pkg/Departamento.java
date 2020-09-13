package pkg;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String area;
    private ArrayList<Professor> lProfessor = new ArrayList<>();

    public Departamento(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Professor> getlProfessor() {
        return lProfessor;
    }

    public void setlProfessor(ArrayList<Professor> lProfessor) {
        this.lProfessor = lProfessor;
    }

    public void adicionarProfessor(Professor professor) {
        lProfessor.add(professor);

    }

    public void removerProfessor(Professor professor) {
        lProfessor.remove(professor);
    }

    public void imprimirListaProfessores() {
        RelatorioProfessor relatorio = new RelatorioProfessor();
        lProfessor.forEach(relatorio::imprimirFolha);
    }
}
