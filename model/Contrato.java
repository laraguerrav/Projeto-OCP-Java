package model;

public class Contrato implements Funcionario {
    private final String nome;
    private final double salario;

    public Contrato(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
