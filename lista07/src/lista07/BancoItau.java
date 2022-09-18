package lista07;

public class BancoItau implements IBancoGeral {

	@Override
	public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		c = new Cliente();
		
		if (tipo.equals("Poupanca")) {
			ContaAbstrata poupanca = new Poupanca(numeroConta, saldoInicial, c);
		}
		
		else if (tipo.equals("ContaCorrente")) {
			ContaAbstrata contaCorrente = new ContaCorrente(numeroConta, saldoInicial, c);
		}
		
		return null;
	}

	@Override
	public boolean depositar(ContaAbstrata c, double valor) {
		return false;
	}

	@Override
	public boolean sacar(ContaAbstrata c, double valor) {
		return false;
	}
	
}
