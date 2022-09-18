package dados;
import entidades.Aluno;

public class AlunoDados {
	
	private Aluno alunos [] = new Aluno[3];
	
	public void cadastrar(Aluno aluno) {

		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = aluno;
		}
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].getNome());
		}
		
	}
	
	public boolean alunoJaCadastrado(String cpf) {
		
		// Busca todos os alunos do array para verificar se o cpf já foi cadastrado.
		
		return false;

	}

}