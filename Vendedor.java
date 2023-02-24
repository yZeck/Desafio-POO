
package Desafio;

public class Vendedor {
	private String nome;
	private double salario;
	private double bonus;
	private int vendas;
	private int totalVendas;
	private double comissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getVendas() {
		return vendas;
	}
	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	public int getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double contVendas(double venda,double valor){
		return venda * valor;
		
	}
	
	public double media() {
		return (this.nota1+ this.nota2)/2;
	}

}
