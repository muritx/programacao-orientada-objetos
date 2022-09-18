package aula07;

public class OperacaoMatematica {
	
	public double Dividir(double a, double b) throws DivisaoPorZeroException {
		
		if (b == 0) {
			throw new DivisaoPorZeroException();
		}
		
		return a / b;
	}

}