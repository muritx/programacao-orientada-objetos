package lista002a;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		Pessoa pessoa1 = new Pessoa();
		
		System.out.print("Digite o nome: ");
		pessoa1.nome = scanner.next();
		
		System.out.print("Digite a idade: ");
		pessoa1.idade = scanner.nextInt();
		
		System.out.print("Digite a altura (em metros): ");
		pessoa1.altura = scanner.nextDouble();
		
		System.out.print("Digite o peso (em Kg): ");
		pessoa1.peso = scanner.nextDouble();
		
		System.out.print("Digite o sexo: ");
		pessoa1.sexo = scanner.next().charAt(0);
		
		pessoa1.imprimeDados();

	}

}
