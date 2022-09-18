/*
package lista003;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		String escolha = "null";
		int i = 0;

		System.out.print("\n=== AGENDA DE CONTATOS ===\n");

		Usuario usuario = new Usuario();

		//System.out.print("Digite seu nome: "); String nomeUsuario = scanner.next(); usuario.setNome(nomeUsuario);
		//System.out.print("Digite seu CPF: "); String cpfUsuario = scanner.next(); usuario.setCPF(cpfUsuario);

		usuario.contatos = new Contato[2];

		do {
			
			System.out.print("\nVocê deseja fazer um cadastro SIMPLES ou COMPLETO? Para finalizar, digite SAIR. ");
			escolha = scanner.next().toLowerCase();	

			for (i = 0; i < usuario.contatos.length; i++)
			{
				if (escolha.equals("simples"))
				{	
					usuario.contatos[i] = new Contato();
					System.out.print("Digite o nome do contato: "); String nome = scanner.next(); usuario.contatos[i].setNome(nome);
					
					break;

				} else if (escolha.equals("completo")) {
					
					usuario.contatos[i] = new Contato();
					System.out.print("Digite o nome do contato: "); String nome = scanner.next(); usuario.contatos[i].setNome(nome);
					System.out.print("Digite sua idade: "); int idade = scanner.nextInt(); usuario.contatos[i].setIdade(idade);
					System.out.print("Digite seu sexo ('M' ou 'F'): "); char sexo = scanner.next().charAt(0); usuario.contatos[i].setSexo(sexo);
					System.out.print("Digite seu celular: "); int foneCelular = scanner.nextInt(); usuario.contatos[i].setFoneCelular(foneCelular);
					System.out.print("Digite seu e-mail: "); String email = scanner.next(); usuario.contatos[i].setEmail(email);
					
					break;

				}
				
				usuario.contatos[i] = null;
				
			}

		} while (!escolha.contains("sair"));

		for (i = 0; i < usuario.contatos.length; i++)
		{
			System.out.println(usuario.contatos[i].getNome());

		}

	}

}
*/

package lista003;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		String escolha = "null";
		
		System.out.print("\n=== AGENDA DE CONTATOS ===\n");

		Usuario usuario = new Usuario();

		//System.out.print("Digite seu nome: "); String nomeUsuario = scanner.next(); usuario.setNome(nomeUsuario);
		//System.out.print("Digite seu CPF: "); String cpfUsuario = scanner.next(); usuario.setCPF(cpfUsuario);

		usuario.contatos = new ArrayList<Contato>();

		do {

			System.out.print("\nVocê deseja fazer um cadastro SIMPLES ou COMPLETO? Para finalizar, digite SAIR. ");
			escolha = scanner.next().toLowerCase();	
			
			for (Contato i : usuario.contatos)
			{
				if (escolha.equals("simples"))
				{	
					usuario.contatos.add(i, new Contato());
					System.out.print("Digite o nome do contato: "); String nome = scanner.next(); usuario.contatos.add(i, usuario.contatos.setNome(nome));
					
					break;

				} else if (escolha.equals("completo")) {
					
					usuario.contatos[i] = new Contato();
					System.out.print("Digite o nome do contato: "); String nome = scanner.next(); usuario.contatos[i].setNome(nome);
					System.out.print("Digite sua idade: "); int idade = scanner.nextInt(); usuario.contatos[i].setIdade(idade);
					System.out.print("Digite seu sexo ('M' ou 'F'): "); char sexo = scanner.next().charAt(0); usuario.contatos[i].setSexo(sexo);
					System.out.print("Digite seu celular: "); int foneCelular = scanner.nextInt(); usuario.contatos[i].setFoneCelular(foneCelular);
					System.out.print("Digite seu e-mail: "); String email = scanner.next(); usuario.contatos[i].setEmail(email);
					
					break;

				}
			
		} while (!escolha.contains("sair"));
		
	}
}