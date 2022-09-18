
public class DVD extends Produto {

	private int duracao;
	
	public DVD(String nome, double preco, int duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "DVD [Nome = " + this.nome + ",\nPreço = " + this.preco + ",\nDuração = " + this.duracao + " minutos]\n";
	}

}
