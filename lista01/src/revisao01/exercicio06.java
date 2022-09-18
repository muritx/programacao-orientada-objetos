package revisao01;

import java.util.Random;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos no array: ");
		int quantidade = scanner.nextInt();
		
		int[] array = new int[quantidade];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt(quantidade * 10);
			System.out.print(array[i] + "\t");
			
		}
		
		calcularMedia(array);
		
		maiorValor(array);
		
		menorValor(array);
		
	}
	
	public static double calcularMedia (int[] array) {
		
		int soma = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			soma = array[i] + soma;
			
		}
		
		double media = soma / array.length;
		
		System.out.println("");
		System.out.println("A média eh: " + media);
		return media;
		
	}
	
	public static int maiorValor (int[] array) {
		
		int maior = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] >= maior)
			{
				maior = array[i];
				
			}
			
		}
		
		System.out.println("O maior número eh: " + maior);
		return maior;
		
	}
	
	public static int menorValor (int[] array) {
		
		int menor = 0;

		for (int i = 0; i < array.length; i++)
		{
			menor = array[0];
			if (menor > array[i])
			{
				menor = array[i];

			}

		}

		System.out.println("O menor número eh: " + menor);
		return menor;

	}
	
}