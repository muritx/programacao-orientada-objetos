
public class Estado {
	
	public String nome;
	public String capital;
	public String[] cidades;
	public double dimensao;
	
	public Estado(String nome, String capital, String[] cidades, double dimensao) {
		
		this.nome = nome;
		this.capital = capital;
		this.cidades = cidades;
		this.dimensao = dimensao;
		
	}
	
	@Override //annotation
	public String toString() { //Herança de Object
		
		return "Nome: " + this.nome + " Capital: " + this.capital;
		
	}

}
