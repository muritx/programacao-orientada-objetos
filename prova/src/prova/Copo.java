package prova;

public class Copo {
	private int capacidadeMaxima, capacidadeAtual;
	private String cor;
	
	public Copo(int capacidadeMaxima, int capacidadeAtual, String cor) {
		super();
		this.capacidadeMaxima = capacidadeMaxima;
		this.capacidadeAtual = capacidadeAtual;
		this.cor = cor;
	}
	
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	
	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void adicionarLiquido(int qtd) {
		
		if (this.capacidadeAtual > this.capacidadeMaxima) {
			System.out.println("O copo " + this.cor + " está com a capacidade máxima excedida. Ele não sofrerá alterações.\n");
			
		} else {
			this.capacidadeAtual += qtd;
			
			if (this.capacidadeAtual > this.capacidadeMaxima) {
				System.out.println("O copo " + this.cor + " transbordou!");
				
			}
			
		}
		
	}
	
	public void esvaziar() {
			this.capacidadeAtual = 0;

	}
	
	public void obterInformacoes() {
		System.out.println("O copo " + this.cor + " armazena até " + this.capacidadeMaxima + " ml e atualmente contém " + this.capacidadeAtual + " ml de líquido.");
		
	}
	
}
