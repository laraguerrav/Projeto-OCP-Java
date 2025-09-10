
package model;
// Funcionario.java

public interface Funcionario {
    // Todo funcionário DEVE ter um método que calcula o salário.
    double calcularSalario();

    // Também é útil ter um método para pegar o nome.
    String getNome();
}