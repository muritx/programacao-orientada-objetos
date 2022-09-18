package Interfaces;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0, n1 = 0, n2 = 0;
		
		while (opcao != 5) {
			
			System.out.println("-- CALCULADORA --");
			System.out.println("1. Soma");
			System.out.println("2. Subtra��o");
			System.out.println("3. Multiplica��o");
			System.out.println("4. Divis�o");
			
			System.out.println("\n5. Sair\n");
			
			System.out.print("Digite a op��o correspondente: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				OperacaoMatematica soma = new Soma();
				
				System.out.println("-- SOMA --");
				n1 = scanner.nextInt(); System.out.println("+ "); n2 = scanner.nextInt(); System.out.print("= \n" + soma.Calcula(n1, n2) + "\n\n");			
				break;
				
			case 2:
				OperacaoMatematica subt = new Subtracao();
				
				System.out.println("-- SUBTRA��O --");
				n1 = scanner.nextInt(); System.out.println("- "); n2 = scanner.nextInt(); System.out.print("= \n" + subt.Calcula(n1, n2) + "\n\n");
				break;
				
			case 3:
				OperacaoMatematica mult = new Multiplicacao();
				
				System.out.println("-- MULTIPLICA��O --");
				n1 = scanner.nextInt(); System.out.println("* "); n2 = scanner.nextInt(); System.out.print("= \n" + mult.Calcula(n1, n2) + "\n\n");
				break;
				
			case 4:
				OperacaoMatematica divi = new Divisao();
				
				System.out.println("-- DIVIS�O --");
				n1 = scanner.nextInt(); System.out.println("/ "); n2 = scanner.nextInt(); System.out.print("= \n" + divi.Calcula(n1, n2) + "\n\n");
				break;
				
			default:
				System.out.println("Finalizando...");
			
			}
			
		}

	}

}
