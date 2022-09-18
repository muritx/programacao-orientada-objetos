package revisao01;

import java.util.Scanner;

public class exercicio08 {
	
	static Scanner scanner = new Scanner (System.in);
	static String formatado = null;
	
	public static void main(String[] args) {
			
		System.out.println(formataTelefone());
		System.out.println(formataCPF());
		System.out.println(formataCEP());
		
	}
	
	public static String formataTelefone() {
		
		String celular = "null";
		
		while (!(celular.matches("^[0-9]*$")) || !(celular.length() == 11)) {
			System.out.print("Digite o número de celular: "); celular = scanner.next();
			
			if (celular.matches("^[0-9]*$") && celular.length() == 11) {
				formatado = "(" + celular.substring(0, 2) + ") " + celular.substring(2, 3) + " " + celular.substring(3, 7) + "-" + celular.substring(7, 11);
				
			} else {
				System.out.println("Formato inválido! Digite novamente.\n");
				
			}
			
		}
		
		return formatado;
		
	}
	
	public static String formataCPF() {

		String cpf = "null";
		
		while (!(cpf.matches("^[0-9]*$")) || !(cpf.length() == 11)) {
			System.out.print("Digite o CPF: "); cpf = scanner.next();
			
			if (cpf.matches("^[0-9]*$") && cpf.length() == 11) {
				formatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
				
			} else {
				System.out.println("Formato inválido! Digite novamente.\n");
				
			}
			
		}
		
		return formatado;
		
	}
	
	public static String formataCEP() {

		String cep = "null";
		
		while (!(cep.matches("^[0-9]*$")) || !(cep.length() == 8)) {
			System.out.print("Digite o CEP: "); cep = scanner.next();
			
			if (cep.matches("^[0-9]*$") && cep.length() == 8) {
				formatado = cep.substring(0, 5) + "-" + cep.substring(5, 8);
				
			} else {
				System.out.println("Formato inválido! Digite novamente.\n");
				
			}
			
		}
		
		return formatado;
		
	}

}
