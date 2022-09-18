package lista07;

public class ContaCorrente extends ContaAbstrata {

	private double limChequeEspecial;
	
	public ContaCorrente(String numero, double saldo, Cliente cliente, double limChequeEspecial) {
		super(numero, saldo, cliente);
		this.limChequeEspecial = limChequeEspecial;
	}	
	
	public ContaCorrente(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}	

	@Override
	public double obterLimite() {
		return getSaldo() + this.limChequeEspecial;
		
	}

}
