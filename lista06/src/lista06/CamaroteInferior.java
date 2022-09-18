package lista06;

public class CamaroteInferior extends VIP {

	String localizacao;
	
	public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional);
		this.valor = valor;
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}
	
	public void imprimirLocalizacao() {
		System.out.println("Localização: " + getLocalizacao());
	}
	
}
