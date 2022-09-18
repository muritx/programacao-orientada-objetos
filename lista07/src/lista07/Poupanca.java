package lista07;

public class Poupanca extends ContaAbstrata {

	public Poupanca(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	@Override
	public double obterLimite() {
		return getSaldo();
		
	}

}
