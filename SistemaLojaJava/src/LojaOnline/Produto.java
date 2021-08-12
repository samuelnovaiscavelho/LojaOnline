package LojaOnline;

public class Produto  extends ClassePrincipal {
	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}	
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
}
