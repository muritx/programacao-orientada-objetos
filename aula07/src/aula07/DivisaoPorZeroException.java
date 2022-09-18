package aula07;

public class DivisaoPorZeroException extends Exception {

	public DivisaoPorZeroException() {
		super("Não é possível realizar divisões por zero!");
	}

}
