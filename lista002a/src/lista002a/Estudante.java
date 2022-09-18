package lista002a;

import java.util.Scanner;

public class Estudante {
	
	Scanner scanner = new Scanner (System.in);

	String nome, idade, curso, matricula;

	public Estudante(String nome, String idade, String curso, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.matricula = matricula;

	}
	
	String valorAntigo, novoValor = null;
	
	public void alterarCampo(String campo) {
		
		System.out.print("\nDigite o novo valor para " + campo + ": "); this.novoValor = scanner.next();
		
		if (campo.contains("nome")) {
			this.valorAntigo = this.nome;
			this.nome = novoValor;
		}
		
		else if (campo.contains("idade")) {
			this.valorAntigo = this.idade;
			this.idade = novoValor;
		}
		
		else if (campo.contains("curso")) {
			this.valorAntigo = this.curso;
			this.curso = novoValor;
		}
		
		else {
			this.valorAntigo = this.matricula;
			this.matricula = novoValor;
		}
		
		imprimirDados(campo);
		
	}
	
	public void imprimirDados(String campo) {
		
		System.out.println("\nCampo alterado: " + campo);
		System.out.println("Valor antigo: " + this.valorAntigo);
		System.out.println("Novo valor: " + novoValor);
		
	}

}
