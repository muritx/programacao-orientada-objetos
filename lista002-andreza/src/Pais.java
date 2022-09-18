
public class Pais {
	
	public String nome; //Brasil - México - Cuba
	public String capital; //BSB 
	public Estado [] estados; //{PB, PR, RN ...}
	public Pais [] fronteiras;
	
	public Pais(String nome, String capital, Estado[] estados, Pais[] fronteiras) {
		
		this.nome = nome;
		this.capital = capital;
		this.estados = estados;
		
	}
	
	public int obterQuantidadeCidades() {
		
		int qtdCidades = 0;
		
		for(Estado e : this.estados) //FOR EACH
		{
			qtdCidades += e.cidades.length;
			
		}
		
		return qtdCidades;		
		
	}
	
	public Estado obterMaiorEstado() {
		
		Estado maiorEstado = null;
		double maiorDimensao = Double.MIN_VALUE;
		
		for(Estado e : this.estados)
		{
			
			if (e.dimensao > maiorDimensao) {
				maiorDimensao = e.dimensao;
				maiorEstado = e;
				
			}
			
		}
		
		return maiorEstado;
		
	}
	
	public boolean ehPaisIgual(Pais p) {
		
		if (this.nome.equals(p.nome) && this.capital.equals(p.capital)) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public void exibirFronteiras() {
		
		StringBuffer texto = new StringBuffer();
		
		for (Pais p : fronteiras) {
			texto.append(p.nome + ", ");
		}
		
		System.out.println(texto);
		
	}
	
	public String toString() {
		
		return "Nome: " + this.nome + " Capital: " + this.capital;
		
	}

}
