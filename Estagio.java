package model;

public class Estagio implements Funcionario {
    private double bolsa;

    public Estagio(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public double calcularPagamento() {
        return bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

}


