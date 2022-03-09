package LojaOnline;


// Usa-se extends para aplicar herança

public class Usuario extends ClassePrincipal {
	private String nome;
	private String cpf;
	private String email;

	// Get serve para você retornar o valor de x.
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	// Void é um tipo de retorno do método

	//Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.Nesses métodos determinamos quando será alterado um atributo e o acesso ao mesmo, tornando o controle e modificações mais práticas e limpas

	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	// Praticamente a palavra-chave "this" é uma referência ao objeto atual (ele mesmo).
	
	public Usuario(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
}