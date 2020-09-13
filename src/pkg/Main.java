package pkg;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ProfessorException, DepartamentoException {
        try {
            Substituto substituto = new Substituto(1, "Lucas", "DOUTOR", 10, 160);
            Concursado concursado = new Concursado(2, "Peter", "DOUTOR", 10, 2);
            JOptionPane.showMessageDialog(null, "Nome:" + substituto.getNome() + "\nTitulação:" + substituto.calcularSalario(10, 30),
                    "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);
            Departamento dass = new Departamento("DASS", "TI");
            dass.adicionarProfessor(concursado);
            JOptionPane.showMessageDialog(null, "sadadsadsasdasdasd",
                    "Lista de Professores", JOptionPane.INFORMATION_MESSAGE);

            Departamento dacc = new Departamento("DACC", "Contrução Civil");
            Departamento daltec = new Departamento("DALTEC", "Ensino Médio");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
