package revisao01;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		int base, expoente, resultado;

		System.out.println("Digite o número da base: ");
		base = scanner.nextInt();

		System.out.println("Digite o número do expoente: ");
		expoente = scanner.nextInt();

		if (base <= 0 || expoente <= 0)
		{
			System.out.println("Número inválido!");
		}
		else
		{

			resultado = base;
			for (int i = 0; i < (expoente - 1); i++)
			{
				base = resultado * base;
			}

			System.out.println("Resultado: " + base);

		}
	}

}