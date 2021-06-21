package entities;

public class Vendedor {

	String nome;
	String cpf;
	Double comissao_tax;
	
	public Vendedor(String nome, String cpf, Double comissao_tax) {
		this.nome = nome;
		this.cpf = cpf;
		this.comissao_tax = comissao_tax;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public Double getComissao() {
		return comissao_tax;
	}
	public void setComissao(Double comissao) {
		this.comissao_tax = comissao;
	}
}
