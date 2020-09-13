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
            retribuicao = switch (this.getTitulacao()) {
                case "GRADUADO" -> salarioBase;
                case "ESPECIALISTA" -> salarioBase * 0.1;
                case "MESTRE" -> salarioBase * 0.15;
                case "DOUTOR" -> salarioBase * 0.4;
                default -> throw new ProfessorException("A titulação não foi encontrada");
            };
        } catch (ProfessorException e) {
            e.printStackTrace();
        }
        return retribuicao;
    }

    @Override
    public double calcularSalario() throws ProfessorException {
        if (salarioBase < 0 || retribuicaoTitulacao < 0 || planoSaude < 0) {
            throw new ProfessorException("Os valores devem ser positivos");
        }
        return salarioBase + retribuicaoTitulacao + planoSaude;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) throws ProfessorException {
        if (salarioBase < 0 || retribuicaoTitulacao < 0 || planoSaude < 0 || adicional< 0 || descontos < 0) {
            throw new ProfessorException("Os valores devem ser positivos");
        }
        return salarioBase + retribuicaoTitulacao + planoSaude + adicional - descontos;
    }
}
