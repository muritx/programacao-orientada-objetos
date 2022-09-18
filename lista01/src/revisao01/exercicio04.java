package revisao01;

import java.util.Random;

public class exercicio04 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] array = new int[10];

		int i, j, aux = 0, soma = 0;
		double media;

		for (i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(500);
			System.out.print(array[i] + "\t");

			soma = array[i] + soma;

		}

		media = soma / array.length;
		System.out.println("\nMédia: " + media);

		for (i = 0; i < array.length; i++)
		{
			for (j = i + 1; j < array.length; j++)
			{
				if (array[i] > array[j])
				{
					aux = array[i];
					array [i] = array[j];
					array [j] = aux;

				}
			}
		}

		for (i = 0; i < array.length; i++)
		{
			if (array[i] < media)
			{
				System.out.print(array [i] + "\t");
			}
		}
	}
}
