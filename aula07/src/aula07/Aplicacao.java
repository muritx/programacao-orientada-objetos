package aula07;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: "); int n1 = scanner.nextInt();
		System.out.print("Digite o segundo número: "); int n2 = scanner.nextInt();
		
		OperacaoMatematica divisao = new OperacaoMatematica();
		
		try {
			System.out.println(divisao.Dividir(n1, n2));
		} catch (DivisaoPorZeroException e) {
			e.printStackTrace(); //Mostra diretamente no console, não para o usuário
			System.out.println(e.getMessage()); //Mostra para o usuário
		}

	}

}
