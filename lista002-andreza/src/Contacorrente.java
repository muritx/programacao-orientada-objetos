
public class Contacorrente extends Conta {

	private double taxa;
	private double chequeEspecial = 100;

	public Contacorrente(int agencia, int conta, Cliente cliente, double saldo, double taxa) {
		super(agencia, conta, cliente, saldo);
		this.taxa = taxa;

	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}



	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public String sacar(double valor) {

		String msg = "Voc� n�o tem saldo suficiente!";

		if (super.getSaldo() + this.getChequeEspecial() >= valor) {
			super.saldo -= valor + this.getChequeEspecial();
			msg = "Saque realizado com sucesso!";
		}

		return msg;

	}

	public String depositar(double valor) {

		String msg = "Valor inv�lido!";

		if (valor > 0) {
			this.saldo += valor;
			msg = "Dep�sito realizado com sucesso!";
		}

		return msg;

	}

}
