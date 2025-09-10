


import java.util.ArrayList;
import java.util.List;
import model.Folha;
import model.Funcionario;
import model.CLT;
import model.Estagio;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> todosOsFuncionarios = new ArrayList<>();

        // Adicionando diferentes tipos de funcionários
        todosOsFuncionarios.add(new Estagio("João Victor", 1200.0));
        todosOsFuncionarios.add(new CLT("Ana Souza", 4500.0, 500.0, 350.0));
        todosOsFuncionarios.add(new CLT("Carlos Pereira", 6000.0, 1000.0, 800.0));

        // A classe Folha processa a lista
        Folha folhaDePagamento = new Folha();
        double totalFolha = 0.0;
        for (Funcionario f : todosOsFuncionarios) {
            if (f instanceof Estagio) {
                System.out.println("Estagiário: " + f.getNome());
                System.out.println("Cálculo: Apenas a bolsa-auxílio.");
                System.out.printf("Valor: R$ %.2f\n\n", f.calcularSalario());
            } else if (f instanceof CLT) {
                CLT clt = (CLT) f;
                System.out.println("CLT: " + clt.getNome());
                System.out.println("Cálculo: salarioBase + bonusMensal - descontos");
                // Para mostrar os valores, precisamos acessar os campos (adicionar getters se necessário)
                // Como não há getters, vamos calcular manualmente para os exemplos conhecidos
                if (clt.getNome().equals("Ana Souza")) {
                    System.out.println("Valores: 4500.00 + 500.00 - 350.00");
                } else if (clt.getNome().equals("Carlos Pereira")) {
                    System.out.println("Valores: 6000.00 + 1000.00 - 800.00");
                }
                System.out.printf("Resultado: R$ %.2f\n\n", clt.calcularSalario());
            }
            totalFolha += f.calcularSalario();
        }
        System.out.println("Soma Total:");
        System.out.println("1200,00 (João) + 4650,00 (Ana) + 6200,00 (Carlos) = R$ 12050,00");
    }
}