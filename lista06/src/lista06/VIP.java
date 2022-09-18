package lista06;

public class VIP extends Ingresso {
	
	double valorAdicional;

	public VIP(double valor, double valorAdicional) {
		super(valor);
		this.valor = valor;
		this.valorAdicional = valorAdicional;
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public double imprimeValor() {
		return getValor() + getValorAdicional();
	}

}
