
public class Cliente {
	
	private String nome;
	private String cpf;
	private Conta[] contas;
	
	public Cliente(String nome, String cpf, Conta[] contas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.contas = contas;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta[] getContas() {
		return this.contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}	

}