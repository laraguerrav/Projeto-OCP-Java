
package model;
// Folha.java
import java.util.List;

public class Folha {
    
    // Este método aceita QUALQUER objeto que seja um "Funcionario".
    public double calcularTotal(List<Funcionario> funcionarios) {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            // Chama o método calcularSalario() específico de cada objeto.
            total += f.calcularSalario();
        }
        return total;
    }
}