package model;

public class Folha {
    private double saldo;

    public void calcular(Funcionario f) {
        saldo += f.calcularPagamento();
    }

    public double getSaldo() {
        return saldo;
    }
}
