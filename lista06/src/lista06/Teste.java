package lista06;

public class Teste {

	public static void comprar(Ingresso ingresso) {
		
		String mensagem = String.format("Valor R$ %.2f", ingresso.imprimeValor());;

		if (ingresso.getClass().getSimpleName().equals("Simples")) {
			System.out.println("Você comprou um ingresso simples!");
			System.out.printf(mensagem);

		} else if (ingresso.getClass().getSimpleName().equals("CamaroteSuperior")) {
			System.out.println("Você comprou um ingresso VIP com Camarote Superior!");
			System.out.printf(mensagem);

		} else if (ingresso.getClass().getSimpleName().equals("CamaroteInferior")) {
			System.out.println("Você comprou um ingresso VIP com Camarote Inferior!");
			System.out.printf(mensagem);

		}

	}

}