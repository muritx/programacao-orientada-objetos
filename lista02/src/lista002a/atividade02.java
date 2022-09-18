package lista002a;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		
		int i;
		Scanner scanner = new Scanner(System.in);	
		Estudante[] array = new Estudante[3];
		
		array[0] = new Estudante("Mariana", "24", "Marketing", "2022001");	
		array[1] = new Estudante("Lucas", "18", "Química", "2022002");
		array[2] = new Estudante("Jéssica", "22", "Medicina", "2022003");
		
		for (i = 0; i < array.length; i++)
		{
			System.out.println(array[i].nome);
		}
		
		System.out.print("\nDigite o nome do aluno a ser editado: "); String escolher = scanner.next();
		System.out.println("\nCampos:    Nome   |   Idade   |   Curso   | Matrícula");
		System.out.print("Qual campo você deseja alterar? "); String campo = scanner.next().toLowerCase();
		
		for (i = 0; i < array.length; i++)
		{
			array[i].alterarCampo(campo);
			break;
			
		}
		
	}

}