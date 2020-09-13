package pkg;

public class Concursado extends Professor {
    private final double salarioBase;
    private final double retribuicaoTitulacao;
    private final double planoSaude;


    public Concursado(int matricula, String nome, String titulacao, double salarioBase, double planoSaude) throws ProfessorException {
        super(matricula, nome, titulacao);
        this.salarioBase = salarioBase;
        this.retribuicaoTitulacao = this.calcularRetribuicao();
        this.planoSaude = planoSaude;
    }

    private double calcularRetribuicao() throws ProfessorException {
        double retribuicao = 0;
        try {
            switch (this.getTitulacao()) {
                case "GRADUADO":
                    break;
                case "ESPECIALISTA":
                    retribuicao = salarioBase * 0.1;
                    break;
                case "MESTRE":
                    retribuicao = salarioBase * 0.15;
                    break;
                case "DOUTOR":
                    retribuicao = salarioBase * 0.4;
                    break;
                default:
                    throw new ProfessorException("A titulação não foi encontrada");
            }
        } catch (ProfessorException e) {
            e.printStackTrace();
        }
        return retribuicao;
    }

    @Override
    public double calcularSalario() throws ProfessorException {
        return salarioBase + retribuicaoTitulacao + planoSaude;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) throws ProfessorException {
        return salarioBase + retribuicaoTitulacao + planoSaude + adicional - descontos;
    }
}
