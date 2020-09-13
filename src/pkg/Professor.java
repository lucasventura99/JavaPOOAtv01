package pkg;

public class Professor implements IProfessor {
    private int matricula;
    private String nome;
    private String titulacao;
    private Endereco endereco;

    public Professor(int matricula, String nome, String titulacao, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public double calcularSalario() throws ProfessorException {
        return 0;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) throws ProfessorException {
        return 0;
    }
}
