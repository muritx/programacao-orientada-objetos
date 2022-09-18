
public class CD extends Produto {
	
	private int numeroDeFaixas;
	
	public CD(String nome, double preco, int numeroDeFaixas) {
		super(nome, preco);
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	public String toString() {
		return "CD [Nome = " + this.nome + ",\nPreço = " + this.preco + ",\nNúmero de faixas = " + this.numeroDeFaixas + "]\n";
	}

}
