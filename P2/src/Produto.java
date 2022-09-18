
public abstract class Produto implements Locavel {
	
	protected String nome;
	protected double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
}
