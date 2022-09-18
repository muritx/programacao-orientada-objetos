
public class Contapoupanca extends Conta {

	public Contapoupanca(int agencia, int conta, Cliente cliente, double saldo) {
		super(agencia, conta, cliente, saldo);
	}

	public String sacar(double valor) {

		String msg = "Você não tem saldo suficiente!";

		if (super.getSaldo() >= valor) {
			super.saldo -= valor;
			msg = "Saque realizado com sucesso!";
		}

		return msg;

	}

}
