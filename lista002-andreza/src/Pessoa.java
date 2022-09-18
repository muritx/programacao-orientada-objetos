
public class Pessoa {
	
	public String nome;
	public int idade;
	public double peso;
	public double altura;
	public char sexo;
	
	//Construtor
	public Pessoa(String nome, int idade, double peso, double altura, char sexo)
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		
	}
	
	public double calculaIMC() {
		
		return this.peso / Math.pow(this.altura, 2);
		
	}
	
	public void imprimeDados() {
		
		String resultado = "";
		System.out.println("Nome: " + this.nome);
		double imc = this.calculaIMC();
		System.out.printf("O IMC é: %.2f\n", imc);
		
		resultado = this.obtemResultadoIMC(imc);
		
		System.out.println("O resultado é: " + resultado);
		
	}
	
	public String obtemResultadoIMC(double imc) {
		
		String resultado;
		
		if (imc <= 18.5) {
			resultado = "Abaixo do peso normal";
			
		} else if (imc > 18.5 && imc <= 25) {
			resultado = "Peso normal";
			
		} else if (imc > 25 && imc <= 30) {
			resultado = "Acima do peso normal";
			
		} else if (imc > 25 && imc <= 30) {
			resultado = "Acima do peso normal";
			
		} else {
			resultado = "Obesidade";
			
		}
		
		return resultado;
		
	}

}
