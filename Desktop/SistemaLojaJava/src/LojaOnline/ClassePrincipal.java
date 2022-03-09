package LojaOnline;

import java.util.List;

    // public: permite acesso a qualquer código externo a classe.
   //  private: proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.

public class ClassePrincipal {

	// void tipo para retorna o método  
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = List.of(
			new Usuario("Samuel Cavelho", "111.111.111-01", "Samuel@gmail.com"),
			new Usuario("Jeremias Joao", "222.222.222-02", "Jeremias@gmail.com")
		);
	
		List<Produto> produtos = List.of(
			new Produto("Smarphone Samsung S10+", 3000.00, 15),
			new Produto("Iphone 11 Max", 4500.00, 5),
			new Produto("Smarphone Xiaomi Mi 9 Lite", 2100.00, 7)

			//Falto declarar List Venda e ItemVenda.


		); 
	}
}