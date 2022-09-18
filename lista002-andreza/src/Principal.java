
public class Principal {

	public static void main(String[] args) {

		int qtdContas = 2;
		
		Conta[] contas = new Conta[qtdContas];
		contas[0] = new Contacorrente(123, 4645646, null, 100, 0.02);
		contas[1] = new Contapoupanca(123, 321, null, 100);
		
		Cliente cliente = new Cliente("João", "84858688", contas);
		Conta cc = new Contacorrente(123, 321, cliente, 100, 0.02);
		Conta cp = new Contapoupanca(123, 321, cliente, 100);
		
		cc.sacar(50);
		cp.sacar(25);

		Conta c = new Contacorrente(123, 321, cliente, 100, 0.02);
		
		abrirConta(c);

	}
	
	public static void abrirConta(Conta c) {
		
		if(c instanceof Contacorrente) { //Verifica qual é o tipo e o tempo de execução. O operador instanceof testa se um objeto tem, em seu prototype, a função construtora.
			System.out.println("Abrindo conta-corrente...");
			System.out.println("Cheque especial: " + ((Contacorrente) c).getChequeEspecial());
		} else if (c instanceof Contapoupanca) {
			System.out.println("Abrindo conta-poupança...");
		}
		
	}

}
