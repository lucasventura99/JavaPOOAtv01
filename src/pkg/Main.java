package pkg;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {

            int matricula1 = getMatricula();
            String nome1 = getNome();
            String titulacao1 = getTitulacao();
            String log1 = getLogradouro();
            int n1 = getNumero();
            String comp1 = getComplemento();
            Cidade cid1 = getCidade();
            double HA = getValorHoraAula();
            double Htrab = getQtdHoraTrabalhadas();

            Departamento departamento1 = getDepartamento();

            Endereco endereco1 = new Endereco(
                    log1,
                    n1,
                    comp1,
                    cid1);

            int matricula2 = getMatricula();
            String nome2 = getNome();
            String titulacao2 = getTitulacao();
            String log2 = getLogradouro();
            int n2 = getNumero();
            String comp2 = getComplemento();
            Cidade cid2 = getCidade();
            double salario = getValorHoraAula();
            double planoSaude = getQtdHoraTrabalhadas();

            Departamento departamento = getDepartamento();

            Endereco endereco2 = new Endereco(
                    log2,
                    n2,
                    comp2,
                    cid2);

            Substituto substituto = new Substituto(matricula1, nome1, titulacao1, endereco1, HA, Htrab);
            Concursado concursado = new Concursado(matricula2, nome2, titulacao2, endereco2, salario, planoSaude);
            JOptionPane.showMessageDialog(null, "Nome:" + substituto.getNome() + "\nTitulação:" + substituto.calcularSalario(10, 30),
                    "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);
            departamento1.adicionarProfessor(concursado);
            departamento1.adicionarProfessor(substituto);
            departamento1.imprimirListaProfessores();


        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static double getPlanoSaude() {
        double planoSaude = 0;
        try {
            planoSaude = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do plano de saúde"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O plano de saúde deve ser um número, sendo ele inteiro e positivo",
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
            JOptionPane.showMessageDialog(null, "O salário deve ser um número, sendo ele inteiro e positivo",
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
            JOptionPane.showMessageDialog(null, "A quantidade de horas trabalhadas deve ser um número, sendo ele inteiro e positivo",
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
            JOptionPane.showMessageDialog(null, "O valor da hora/aula deve ser um número, sendo ele inteiro e positivo",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(9);
        }
        return valor;
    }

    private static Endereco getEndereco() {
        return new Endereco(getLogradouro(), getNumero(), getComplemento(), getCidade());
    }

    private static int getNumero() {
        int numero = 0;
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número"));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O número deve ser um número, sendo ele inteiro e positivo",
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
        Departamento dass = new Departamento("DASS", "TI");
        Departamento dacc = new Departamento("DACC", "Contrução Civil");
        Departamento daltec = new Departamento("DALTEC", "Ensino Médio");
        Object[] departamentos = {dass.getNome(), dacc.getNome(), daltec.getNome()};
        int departamento = (int) JOptionPane.showInputDialog(null,
                "Escolha um item", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                departamentos, departamentos[0]);

        Departamento dpt;
        switch (departamento) {
            case 0 -> {
                dpt = dass;
            }
            case 1 -> {
                dpt = dacc;
            }
            case 2 -> {
                dpt = daltec;
            }
            default -> throw new IllegalStateException("Unexpected value: " + departamento);
        }
        return dpt;
    }

    private static String getNome() {
        return JOptionPane.showInputDialog("Insira o nome do professor");
    }

    private static int getMatricula() {
        int matricula = 0;
        try {
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Insira a matrícula do professor"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A matrícula deve ser um número, sendo ele inteiro e positivo",
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

    private static Cidade getCidade() {
        Cidade fln = new Cidade(1, "Florianópolis", "SC");
        Cidade sj = new Cidade(2, "São José", "SC");
        Cidade plc = new Cidade(3, "Palhoça", "SC");
        Object[] cidades = {fln.getNome(), sj.getNome(), plc.getNome()};

        int cidade = (int) JOptionPane.showInputDialog(null,
                "Escolha um item", "Opção",
                JOptionPane.INFORMATION_MESSAGE, null,
                cidades, cidades[0]);

        Cidade cidadeSelecionada;

        switch (cidade) {
            case 0 -> {
                cidadeSelecionada = fln;
            }
            case 1 -> {
                cidadeSelecionada = sj;
            }
            case 2 -> {
                cidadeSelecionada = plc;
            }
            default -> throw new IllegalStateException("Unexpected value: " + cidade);
        }
        return cidadeSelecionada;
    }
}
