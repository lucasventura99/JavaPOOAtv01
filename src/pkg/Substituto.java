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
    public double calcularSalario() throws ProfessorException {
        if (qtdHorasTrabalhadasMensal < 0 || valorHoraAula < 0) {
            throw new ProfessorException("Os valores devem ser positivos");
        }
        return qtdHorasTrabalhadasMensal * valorHoraAula;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) throws ProfessorException {
        if (qtdHorasTrabalhadasMensal < 0 || valorHoraAula < 0 || adicional< 0 || descontos < 0) {
            throw new ProfessorException("Os valores devem ser positivos");
        }
        return qtdHorasTrabalhadasMensal * valorHoraAula + adicional - descontos;
    }
}
