package pkg;

public class Substituto extends Professor {
    private final double valorHoraAula;
    private final double qtdHorasTrabalhadasMensal;

    public Substituto(int matricula, String nome, String titulacao, double valorHoraAula, double qtdHorasTrabalhadasMensal) {
        super(matricula, nome, titulacao);
        this.valorHoraAula = valorHoraAula;
        this.qtdHorasTrabalhadasMensal = qtdHorasTrabalhadasMensal;
    }

    @Override
    public double calcularSalario() {
        return qtdHorasTrabalhadasMensal * valorHoraAula;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) {
        return qtdHorasTrabalhadasMensal * valorHoraAula + adicional - descontos;
    }
}
