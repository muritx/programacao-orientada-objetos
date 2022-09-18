/*
package lista003;

public class Usuario {
	
	String nome, cpf;
	Contato[] contatos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setContatos (Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nContatos: ";
	}

}
*/

package lista003;

import java.util.ArrayList;

public class Usuario {
	
	String nome, cpf;
	ArrayList<Contato> contatos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setContatos (ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nContatos: ";
	}
	
}