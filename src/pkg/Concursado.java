package pkg;

public class Concursado extends Professor {
    private final double salarioBase;
    private final double retribuicaoTitulacao;
    private final double planoSaude;


    public Concursado(int matricula, String nome, String titulacao, double salarioBase, double planoSaude) {
        super(matricula, nome, titulacao);
        this.salarioBase = salarioBase;
        this.retribuicaoTitulacao = this.calcularRetribuição();
        this.planoSaude = planoSaude;
    }

    private double calcularRetribuição() {
        double retribuicao = 0;
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
        }
        return retribuicao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + retribuicaoTitulacao + planoSaude;
    }

    @Override
    public double calcularSalario(double adicional, double descontos) {
        return salarioBase + retribuicaoTitulacao + planoSaude + adicional - descontos;
    }
}
