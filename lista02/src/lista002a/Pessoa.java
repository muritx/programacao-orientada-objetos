package lista002a;

public class Pessoa {

	String nome;
	int idade;
	double altura, peso;
	char sexo;
	
	public double calculaIMC() {
		
		return this.peso / (this.altura * this.altura);
		
	}
	
	public void imprimeDados() {
		
		System.out.println(this.nome);
		System.out.println(this.calculaIMC());
		String resultado;
		
		if (this.calculaIMC() <= 18.5) {
			resultado = "Abaixo do peso normal.";
		}
		
		else if (this.calculaIMC() < 18.5 && this.calculaIMC() <= 25) {
			resultado = "Peso normal";
		}
		
		else if (calculaIMC() < 25.5 && this.calculaIMC() <= 30) {
			resultado = "Acima do peso normal";
		}
		
		else {
			resultado = "Obesidade";
		}
		
		System.out.println(resultado);
		
	}
	
}