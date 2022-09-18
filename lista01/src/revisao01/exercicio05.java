package revisao01;

public class exercicio05 {

	public static void main(String[] args) {

		int[] arrayA = {54, 35, 90, 49, 7};
		int[] arrayB = {68, 90, 7, 31, 35};
		int i, j, k = 0, quantidade = 0;

		System.out.println("Vetor A: ");
		for (i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + "\t");

		}

		System.out.println("");

		System.out.println("Vetor B: ");
		for (j = 0; j < arrayB.length; j++) {
			System.out.print(arrayB[j] + "\t");

		}

		for (i = 0; i < arrayA.length; i++)
		{
			for (j = 0; j < arrayB.length; j++)
			{

				if (arrayA[i] == arrayB[j])
				{
					quantidade = quantidade + 1;

				}

			}
		}

		if (quantidade >= 1)
		{
			int[] arrayC = new int[quantidade];

			for (i = 0; i < arrayA.length; i++)
			{
				for (j = 0; j < arrayB.length; j++)
				{
					if (arrayA[i] == arrayB[j])
					{
						arrayC[k] = arrayA[i];
						k++;

					}
				}
			}
			
			System.out.println("");
			
			System.out.println("Vetor C:");
			for (k = 0; k < arrayC.length; k++) {
				System.out.print(arrayC[k] + "\t");

			}

		}
	}

}