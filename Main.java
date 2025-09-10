import model.*;

public class Main {
    public static void main(String[] args) {
        Funcionario contrato1 = new Contrato(3000.0);
        Funcionario estagiario1 = new Estagio(1200.0);

        Folha folha = new Folha();

        folha.calcular(contrato1);
        folha.calcular(estagiario1);

        System.out.println("Total da folha de pagamento: R$ " + folha.getSaldo());
    }
}
