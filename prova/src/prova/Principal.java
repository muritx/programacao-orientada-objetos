package prova;

public class Principal {

	public static void main(String[] args) {
		
		Copo copoA = new Copo(500, 500, "azul");
		Copo copoB = new Copo(750, 0, "vermelho");
		
		copoA.esvaziar();
		copoB.adicionarLiquido(copoB.getCapacidadeMaxima()/2);
		
		copoA.obterInformacoes();
		copoB.obterInformacoes();

	}

}