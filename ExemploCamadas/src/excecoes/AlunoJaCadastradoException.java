package excecoes;

import java.lang.Exception;

public class AlunoJaCadastradoException extends Exception {
	
	public AlunoJaCadastradoException() {
		super("Aluno j� cadastrado. Por favor tente novamente.");
	}

}
