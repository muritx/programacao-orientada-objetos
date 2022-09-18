
public class Conta {
	
	private int agencia;
	private int conta;
	private Cliente cliente;
	protected double saldo;
	
public Conta(int agencia, int conta, Cliente cliente, double saldo) {
		
		this.agencia = agencia;
		this.conta = conta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String sacar(double valor) {
		
		return "Saque...";
		
	}

}
