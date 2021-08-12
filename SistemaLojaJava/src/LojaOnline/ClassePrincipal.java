package LojaOnline;

import java.util.List;

public class ClassePrincipal {
	public static void main(String[] args) {
		
		List<Usuario> usuarios = List.of(
			new Usuario("Samuel Cavelho", "111.111.111-01", "Samuel@gmail.com"),
			new Usuario("Jeremias João", "222.222.222-02", "Jeremias@gmail.com")
		);
	
		List<Produto> produtos = List.of(
			new Produto("Smarphone Samsung S10+", 3000.00, 15),
			new Produto("Iphone 11 Max", 4500.00, 5),
			new Produto("Smarphone Xiaomi Mi 9 Lite", 2100.00, 7)
		); 
	}
}