package lista05;

import java.util.Scanner;

public class Candidato extends Eleitor {

	static Scanner scanner = new Scanner (System.in);
	
	String partido;
	double totalVotos;
	int numero;
	
	public Candidato(String nome, String cpf, String título, String partido, double totalVotos, int numero) {
		super(nome, cpf, título);
		this.partido = partido;
		this.totalVotos = totalVotos;
		this.numero = numero;
	}
	
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public double getTotalVotos() {
		return totalVotos;
	}

	public void setTotalVotos(double totalVotos) {
		this.totalVotos = totalVotos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void cadastrarCandidato(Candidato[] candidatos) {		
		System.out.println("\nCADASTRO DE CANDIDATOS");

		for (int i = 0; i < candidatos.length; i++) {	
			System.out.println("\n=== CADASTRO DO " + (i + 1) +"º CANDIDATO ===");
			
			candidatos[i] = new Candidato(null, null, null, null, 0, 0);
			System.out.print("Nome: "); String nome = scanner.next(); candidatos[i].setNome(nome);
			System.out.print("CPF: "); String cpf = scanner.next(); candidatos[i].setCpf(cpf);
			System.out.print("Título: "); String título = scanner.next(); candidatos[i].setTítulo(título);
			System.out.print("Partido: "); String partido = scanner.next(); candidatos[i].setPartido(partido);
			System.out.print("Número: "); int numero = scanner.nextInt(); candidatos[i].setNumero(numero);		
			candidatos[i].setTotalVotos(0);
			
		}
		
	}
	
	public static void mostrarCandidatos(Candidato[] candidatos) {
		System.out.println("=== CANDIDATOS ===");
		System.out.println("NOME - PARTIDO - NÚMERO");
		
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println(candidatos[i].getNome() + " - " + candidatos[i].getPartido() + " - " + candidatos[i].getNumero());
		}
		
	}

}
