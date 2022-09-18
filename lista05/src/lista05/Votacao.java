package lista05;

import java.util.Scanner;

public class Votacao {

	static double contagem = 0;
	
	public static void main(String[] args) {

		System.out.println("=== VOTAÇÃO ===");

		Candidato[] candidatos = new Candidato[2];
		Candidato.cadastrarCandidato(candidatos);
		Candidato.mostrarCandidatos(candidatos);

		Eleitor[] eleitores = new Eleitor[5];
		Eleitor.cadastrarEleitor(eleitores);
		Eleitor.verificarTitulo(eleitores);

		votar(candidatos, eleitores);
		mostrarResultados(candidatos);
		
	}

	public static void votar(Candidato[] candidatos, Eleitor[] eleitores) {

		Scanner scanner = new Scanner(System.in);
		boolean votoComputado = false;

		for (int i = 0; i < eleitores.length; i++) {

			if (eleitores[i].título.equals("repetido")) {
				System.out.println("O título do eleitor " + (i + 1) + " está repetido. O voto foi anulado. \n");

			} else {

				do {

					votoComputado = false;
					System.out.print("Número do candidato do eleitor " + (i + 1) + ": "); int voto = scanner.nextInt();

					for (int j = 0; j < candidatos.length; j++)
					{
						if (voto == candidatos[j].getNumero()) {
							candidatos[j].totalVotos += 1;
							votoComputado = true;
							contagem += 1;

						}
					}

					if (votoComputado) {
						System.out.println("Voto computado!\n");

					} else {
						System.out.println("Candidato não encontrado. Tente novamente.\n");

					}

				} while (votoComputado == false);

			}

		}

	}

	public static void mostrarResultados(Candidato[] candidatos) {
		
		if (candidatos[0].getTotalVotos() > candidatos[1].getTotalVotos())
		{
			System.out.printf("O candidato %s venceu as eleições com %.2f por cento dos votos totais.", candidatos[0].getNome(), ((candidatos[0].getTotalVotos()/contagem)*100));

		} else {
			System.out.printf("O candidato %s venceu as eleições com %.2f por cento dos votos totais.", candidatos[1].getNome(), ((candidatos[1].getTotalVotos()/contagem)*100));

		}
		
	}
}