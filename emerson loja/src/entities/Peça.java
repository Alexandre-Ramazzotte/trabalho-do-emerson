package entities;

public class Peça {

	String nome;
	String descricao;
	Double val;
	
	public Peça(String nome, String descricao, Double val) {
		this.nome = nome;
		this.descricao = descricao;
		this.val = val;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double val) {
		this.val = val;
	}
}
