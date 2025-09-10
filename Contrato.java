package model;

public class Contrato implements Funcionario {
    private double salario;

    public Contrato(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

    public double getSalario() {
        return salario;
    }
}
