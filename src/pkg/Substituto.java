package pkg;

public class Substituto extends Professor {
    private double valorHoraAula;
    private double qtdHorasTrabalhadasMensal;

    public Substituto(int matricula, String nome, String titulacao, double valorHoraAula, double qtdHorasTrabalhadasMensal) {
        super(matricula, nome, titulacao);
        this.valorHoraAula = valorHoraAula;
        this.qtdHorasTrabalhadasMensal = qtdHorasTrabalhadasMensal;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public double getQtdHorasTrabalhadasMensal() {
        return qtdHorasTrabalhadasMensal;
    }

    @Override
    public double calcularSalario() throws ProfessorException {
        try {
            if (qtdHorasTrabalhadasMensal < 0 || valorHoraAula < 0) {
                throw new ProfessorException("Os valores devem ser positivos");
            }
        } catch (ProfessorException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return qtdHorasTrabalhadasMensal * valorHoraAula;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) throws ProfessorException {
        try {
            if (qtdHorasTrabalhadasMensal < 0 || valorHoraAula < 0 || adicional < 0 || descontos < 0) {
                throw new ProfessorException("Os valores devem ser positivos");
            }
        } catch (ProfessorException e) {
            e.printStackTrace();
            System.exit(2);

        }
        return qtdHorasTrabalhadasMensal * valorHoraAula + adicional - descontos;
    }
}
