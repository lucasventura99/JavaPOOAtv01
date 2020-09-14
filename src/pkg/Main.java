package pkg;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            int matricula1 = getMatricula();
            String nome1 = getNome();
            String titulacao1 = getTitulacao();
            Endereco endereco1 = getEndereco();
            double hora1 = getValorHoraAula();
            double trabalho1 = getQtdHoraTrabalhadas();

            int matricula2 = getMatricula();
            String nome2 = getNome();
            String titulacao2 = getTitulacao();
            Endereco endereco2 = getEndereco();
            Departamento departamento2 = getDepartamento();
            double salario2 = getSalarioBase();
            double planoSaude2 = getPlanoSaude();

            Substituto substituto = new Substituto(matricula1, nome1, titulacao1, endereco1, hora1, trabalho1);
            Concursado concursado = new Concursado(matricula2, nome2, titulacao2, endereco2, salario2, planoSaude2);

            Departamento departamento1 = getDepartamento();
            departamento1.adicionarProfessor(substituto);
            departamento1.adicionarProfessor(concursado);
            departamento1.removerProfessor(substituto);
            departamento1.adicionarProfessor(substituto);
            departamento2.adicionarProfessor(concursado);
            departamento2.removerProfessor(concursado);
            departamento2.adicionarProfessor(concursado);
            departamento1.imprimirListaProfessores();
            departamento2.imprimirListaProfessores();
        } catch (Exception e) {
            e.getStackTrace();
            System.exit(13);
        }
    }

    private static double getPlanoSaude() {
        double planoSaude = 0;
        try {
            planoSaude = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do plano de saúde"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O plano de saúde deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(12);
        }
        return planoSaude;
    }

    private static double getSalarioBase() {
        double salario = 0;
        try {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O salário deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(11);
        }
        return salario;
    }

    private static double getQtdHoraTrabalhadas() {
        double horas = 0;
        try {
            horas = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A quantidade de horas trabalhadas deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(10);
        }
        return horas;
    }

    private static double getValorHoraAula() {
        double valor = 0;
        try {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da Hora/Aula"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor da hora/aula deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(9);
        }
        return valor;
    }

    private static Endereco getEndereco() {
        return new Endereco(getLogradouro(), getNumero(), getComplemento(), getCidadeFixo());
    }

    private static int getNumero() {
        int numero = 0;
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número"));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O número do endereço deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(8);
        }
        return numero;
    }

    private static String getComplemento() {
        return JOptionPane.showInputDialog("Insira o complemento");
    }

    private static String getLogradouro() {
        return JOptionPane.showInputDialog("Insira o endereço");
    }

    private static Departamento getDepartamento() {
        Object[] departamentos = {"DASS", "DACC", "DALTEC"};

        String valor = (String) JOptionPane.showInputDialog(null,
                "Escolha um item", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null,
                departamentos, departamentos[0]);

        switch (valor) {
            case "DASS":
                Departamento dass = new Departamento("DASS", "TI");
                return dass;
            case "DACC":
                Departamento dacc = new Departamento("DACC", "Contrução Civil");
                return dacc;
            case "DALTEC":
                Departamento daltec = new Departamento("DALTEC", "Ensino Médio");
                return daltec;
            default:
                throw new IllegalStateException("Unexpected value: " + valor);
        }
    }

    private static String getNome() {
        return JOptionPane.showInputDialog("Insira o nome do professor");
    }

    private static int getMatricula() {
        int matricula = 0;
        try {
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matrícula do professor"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A matrícula deve ser um número inteiro e positivo.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(7);
        }
        return matricula;
    }

    private static String getTitulacao() {
        Object[] titulacoes = {"GRADUADO", "ESPECIALISTA", "MESTRE", "DOUTOR"};
        return (String) JOptionPane.showInputDialog(null,
                "Escolha uma titulação", "Titulação",
                JOptionPane.INFORMATION_MESSAGE, null,
                titulacoes, titulacoes[0]);
    }

    private static Cidade getCidadeFixo() {
        Object[] cidades = {"Florianópolis", "São José", "Palhoça"};

        String valor = (String) JOptionPane.showInputDialog(null,
                "Escolha uma cidade", "Opção",
                JOptionPane.QUESTION_MESSAGE, null,
                cidades, cidades[0]);

        switch (valor) {
            case "Florianópolis" -> {
                return new Cidade(1, "Florianópolis", "SC");
            }
            case "São José" -> {
                return new Cidade(2, "São José", "SC");
            }
            case "Palhoça" -> {
                return new Cidade(3, "Palhoça", "SC");
            }
            default -> throw new IllegalStateException("Unexpected value: " + valor);
        }
    }
}
