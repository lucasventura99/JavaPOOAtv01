package pkg;

public class Substituto extends Professor {
    private double valorHoraAula;
    private double qtdHorasTrabalhadasMensal;

    public Substituto(int matricula, String nome, String titulacao, Endereco endereco, double valorHoraAula, double qtdHorasTrabalhadasMensal) {
        super(matricula, nome, titulacao, endereco);
        this.valorHoraAula = valorHoraAula;
        this.qtdHorasTrabalhadasMensal = qtdHorasTrabalhadasMensal;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public double getQtdHorasTrabalhadasMensal() {
        return qtdHorasTrabalhadasMensal;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public void setQtdHorasTrabalhadasMensal(double qtdHorasTrabalhadasMensal) {
        this.qtdHorasTrabalhadasMensal = qtdHorasTrabalhadasMensal;
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
