
package model;

public class CLT implements Funcionario {
	private final String nome;
	private final double salarioBase;
	private final double bonusMensal;
	private final double descontos;

	public CLT(String nome, double salarioBase, double bonusMensal, double descontos) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.bonusMensal = bonusMensal;
		this.descontos = descontos;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double calcularSalario() {
		return this.salarioBase + this.bonusMensal - this.descontos;
	}
}