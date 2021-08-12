package LojaOnline;

public class Usuario extends ClassePrincipal {
	private String nome;
	private String cpf;
	private String email;
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public Usuario(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
}