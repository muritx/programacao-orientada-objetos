package lista003;

public class Contato {
	
	String nome, email;
	int idade, foneCelular;
	char sexo;
	
	public Contato() {
		
	}
	
	public Contato(String nome) {
		this.nome = nome;
		
	}

	public Contato(String nome, int idade, char sexo, int foneCelular, String email) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.foneCelular = foneCelular;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getFoneCelular() {
		return foneCelular;
	}

	public void setFoneCelular(int foneCelular) {
		this.foneCelular = foneCelular;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\nCelular: " + this.foneCelular + "\nE-mail: " + this.email;
	}

}
