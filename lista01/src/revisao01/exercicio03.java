package revisao01;

import java.util.Random;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o tamanho desejado do array: ");
		int tamanho = scanner.nextInt();
		int i, maior = 0, index = 0;
		int[] array = new int[tamanho];

		for (i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(tamanho * 10);
			System.out.print(array[i] + "\t");

			if (array[i] >= maior)
			{
				maior = array[i];
				index = i;
			}
		}
		
		System.out.println("\nPosição do maior número: " + index);

	}

}
