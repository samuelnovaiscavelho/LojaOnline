package LojaOnline;

public class ItemVenda {
	private Produto produto;
	private Integer quantidade;

	public Produto getProduto() {
		return produto;
	}

	public double getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(Produto produto) {
		this.produto = produto;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public ItemVenda(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}	
}