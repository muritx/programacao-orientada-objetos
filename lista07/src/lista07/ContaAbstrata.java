package lista07;

public abstract class ContaAbstrata {
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	public ContaAbstrata(String numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public abstract double obterLimite();
	
	public double depositar(double valor) {
		return this.saldo + valor;
	}
	
	public double sacar(double valor) {
		return this.saldo - valor;
	}

}
