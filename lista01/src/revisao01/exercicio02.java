package revisao01;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		int base, expoente, resultado;

		System.out.println("Digite o n�mero da base: ");
		base = scanner.nextInt();

		System.out.println("Digite o n�mero do expoente: ");
		expoente = scanner.nextInt();

		if (base <= 0 || expoente <= 0)
		{
			System.out.println("N�mero inv�lido!");
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