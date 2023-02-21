package Exercio1;

public class Cliente {

	private String nomeCompleto;
	private String cpf;
	private String endereco;
	private String telefone;
	private String email;

	public Cliente(String nomeCompleto, String cpf, String endereco, String telefone, String email) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nomeCompleto;
	}

	public void setNome(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void visualizar() {
		System.out.println(nomeCompleto + ", " + cpf + ", " + endereco + ", " + telefone + ", " + email);
	}
}
