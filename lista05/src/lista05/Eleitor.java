package lista05;

import java.util.Scanner;

public class Eleitor {
	
	static Scanner scanner = new Scanner (System.in);	
	
	String nome, cpf, t�tulo;

	public Eleitor(String nome, String cpf, String t�tulo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.t�tulo = t�tulo;
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

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}
	
	public static void cadastrarEleitor(Eleitor[] eleitores) {		
		System.out.println("\nCADASTRO DE ELEITORES\n");

		for (int i = 0; i < eleitores.length; i++) {	
			System.out.println("=== CADASTRO DO " + (i + 1) +"� ELEITOR ===");
			
			eleitores[i] = new Eleitor(null, null, null);
			System.out.print("Nome: "); String nome = scanner.next(); eleitores[i].setNome(nome);
			System.out.print("CPF: "); String cpf = scanner.next(); eleitores[i].setCpf(cpf);
			System.out.print("T�tulo: "); String t�tulo = scanner.next(); eleitores[i].setT�tulo(t�tulo);
			
			System.out.println("");

		}
		
	}
	
	public static void verificarTitulo(Eleitor[] eleitores) {

		for (int i = 0; i < eleitores.length; i++)
		{			
			for (int j = i + 1; j < eleitores.length; j++)
			{
				if (eleitores[i].t�tulo.equals(eleitores[j].t�tulo)) {
					eleitores[j].t�tulo = "repetido";

				}

			}
			
		}
		
	}

}