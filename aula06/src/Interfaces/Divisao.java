package Interfaces;

public class Divisao implements OperacaoMatematica {
	
	@Override
	public double Calcula(int a, int b) {
		return a / b;
	}

}
