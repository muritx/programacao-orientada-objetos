import aula04.Utils;

public class Aula04 {

	public static void main(String[] args) {
		
		//Utils.formataCPF("04505749388");
		
		Cliente cliente = new Cliente ("João", "848586688");
		
		Contacorrente cc = new Contacorrente(123, 321, cliente, 100);
		
		System.out.println(cc.sacar(120));
		
		System.out.println("Seu saldo é: " + cc.getSaldo());
 
	}

}
