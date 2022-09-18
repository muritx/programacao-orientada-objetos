package revisao01;

import java.util.Random;

public class exercicio01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int i;
		
		System.out.println("Vetor A: ");
		for (i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = random.nextInt(100);
			vetorB[i] = vetorA[i] * 3;
			System.out.print(vetorA[i] + "\t");
		}
		
		System.out.println("\nVetor B: ");
		
		for (i = 0; i < vetorB.length; i++)
		{
			System.out.print(vetorB[i] + "\t");
			
		}

	}

}