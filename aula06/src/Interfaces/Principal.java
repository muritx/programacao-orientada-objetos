package Interfaces;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0, n1 = 0, n2 = 0;
		
		while (opcao != 5) {
			
			System.out.println("-- CALCULADORA --");
			System.out.println("1. Soma");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			
			System.out.println("\n5. Sair\n");
			
			System.out.print("Digite a opção correspondente: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			case 1:
				OperacaoMatematica soma = new Soma();
				
				System.out.println("-- SOMA --");
				n1 = scanner.nextInt(); System.out.println("+ "); n2 = scanner.nextInt(); System.out.print("= \n" + soma.Calcula(n1, n2) + "\n\n");			
				break;
				
			case 2:
				OperacaoMatematica subt = new Subtracao();
				
				System.out.println("-- SUBTRAÇÃO --");
				n1 = scanner.nextInt(); System.out.println("- "); n2 = scanner.nextInt(); System.out.print("= \n" + subt.Calcula(n1, n2) + "\n\n");
				break;
				
			case 3:
				OperacaoMatematica mult = new Multiplicacao();
				
				System.out.println("-- MULTIPLICAÇÃO --");
				n1 = scanner.nextInt(); System.out.println("* "); n2 = scanner.nextInt(); System.out.print("= \n" + mult.Calcula(n1, n2) + "\n\n");
				break;
				
			case 4:
				OperacaoMatematica divi = new Divisao();
				
				System.out.println("-- DIVISÃO --");
				n1 = scanner.nextInt(); System.out.println("/ "); n2 = scanner.nextInt(); System.out.print("= \n" + divi.Calcula(n1, n2) + "\n\n");
				break;
				
			default:
				System.out.println("Finalizando...");
			
			}
			
		}

	}

}
