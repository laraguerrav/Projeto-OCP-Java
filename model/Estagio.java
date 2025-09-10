package model;
// Estagio.java

public class Estagio implements Funcionario {
    
    private final String nome;
    private final double bolsaAuxilio;

    public Estagio(String nome, double bolsaAuxilio) {
        this.nome = nome;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double calcularSalario() {
        // Estagiário não tem descontos neste modelo simples, o salário é a bolsa.
        return this.bolsaAuxilio;
    }
}