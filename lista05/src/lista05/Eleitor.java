package lista05;

import java.util.Scanner;

public class Eleitor {
	
	static Scanner scanner = new Scanner (System.in);	
	
	String nome, cpf, título;

	public Eleitor(String nome, String cpf, String título) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.título = título;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}
	
	public static void cadastrarEleitor(Eleitor[] eleitores) {		
		System.out.println("\nCADASTRO DE ELEITORES\n");

		for (int i = 0; i < eleitores.length; i++) {	
			System.out.println("=== CADASTRO DO " + (i + 1) +"º ELEITOR ===");
			
			eleitores[i] = new Eleitor(null, null, null);
			System.out.print("Nome: "); String nome = scanner.next(); eleitores[i].setNome(nome);
			System.out.print("CPF: "); String cpf = scanner.next(); eleitores[i].setCpf(cpf);
			System.out.print("Título: "); String título = scanner.next(); eleitores[i].setTítulo(título);
			
			System.out.println("");

		}
		
	}
	
	public static void verificarTitulo(Eleitor[] eleitores) {

		for (int i = 0; i < eleitores.length; i++)
		{			
			for (int j = i + 1; j < eleitores.length; j++)
			{
				if (eleitores[i].título.equals(eleitores[j].título)) {
					eleitores[j].título = "repetido";

				}

			}
			
		}
		
	}

}