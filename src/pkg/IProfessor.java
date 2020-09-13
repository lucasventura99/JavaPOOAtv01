package pkg;

public interface IProfessor {
    double calcularSalario() throws ProfessorException;

    double calcularSalario(double adicional, double descontos) throws ProfessorException;
}
