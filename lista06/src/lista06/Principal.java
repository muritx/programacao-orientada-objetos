package lista06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valor = 15.00, valorAdicional = 20.00, adicionalSuperior = 10.00;
		
		Ingresso ingresso = new Ingresso(valor);
		
		System.out.println("=== COMPRA DE INGRESSOS ===");
		System.out.print("Digite 1 para INGRESSO SIMPLES ou 2 para INGRESSO VIP: "); int escolha = scanner.nextInt();
		
		if (escolha == 1) {
			ingresso = new Simples(valor);
			
		} else if (escolha == 2) {
			
			System.out.println("\n=== VIP ===");
			System.out.print("Digite 1 para Camarote Superior ou 2 para Camarote Inferior: "); escolha = scanner.nextInt();
			
			if (escolha == 1) {
				ingresso = new CamaroteSuperior(valor, valorAdicional, adicionalSuperior);
				
			} else if (escolha == 2) {
				ingresso = new CamaroteInferior(valor, valorAdicional, "P15");
				//System.out.println(CamaroteInferior.getLocalizacao());
				
			}
			
		}
		
		Teste.comprar(ingresso);

	}

}