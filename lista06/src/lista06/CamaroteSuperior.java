package lista06;

public class CamaroteSuperior extends VIP {
	
	double adicionalSuperior = 10;

	public CamaroteSuperior(double valor, double valorAdicional, double adicionalSuperior) {
		super(valor, valorAdicional);
		this.valor = valor;
		this.valorAdicional = valorAdicional;
		this.adicionalSuperior = adicionalSuperior;
		
	}

	public double getAdicionalSuperior() {
		return adicionalSuperior;
	}
	
	public double imprimeValor() {
		return getValor() + getValorAdicional() + getAdicionalSuperior();
	}

}
