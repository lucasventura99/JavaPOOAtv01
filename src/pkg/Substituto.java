package pkg;

public class Substituto extends Professor {
    private final double valorHoraAula;
    private final double qtdHorasTrabalhadasMensal;

    public Substituto(int matricula, String nome, String titulacao, double valorHoraAula, double qtdHorasTrabalhadasMensal) {
        super(matricula, nome, titulacao);
        this.valorHoraAula = valorHoraAula;
        this.qtdHorasTrabalhadasMensal = qtdHorasTrabalhadasMensal;
    }
}
