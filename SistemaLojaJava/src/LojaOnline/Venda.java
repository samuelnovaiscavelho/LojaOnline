package LojaOnline;

import java.util.Date;
import java.util.List;

public class Venda {
	private Date data;
	private List<ItemVenda> itens;
	private Double preco;
	private Usuario usuario;
	
	public Date getData() {
		return data;
	}
	
	public List<ItemVenda> getItens() {
		return itens;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Venda(Date data, List<ItemVenda> itens, Double preco, Usuario usuario) {
		this.data = data;
		this.itens = itens;
		this.preco = preco;
		this.usuario = usuario;
	}
}