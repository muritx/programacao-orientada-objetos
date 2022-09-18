import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		
		HashSet<Veiculo> filaVeiculosA = new HashSet<Veiculo>();
		
		Posto postoA = new Posto(3, filaVeiculosA, 7.90, 7.50);		
		
		Veiculo motoA = new Moto(15, 5);
		Veiculo motoB = new Moto(15, 10);
		Veiculo carroA = new Carro(50, 25);
		
		/***********************************************************/
		
		try {
			postoA.adicionarVeiculo(motoA);
			System.out.println(motoA.toString() + " adicionado(a)!");
		} catch (AtingiuCapacidadeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			postoA.adicionarVeiculo(motoB);
			System.out.println(motoB.toString() + " adicionado(a)!");
		} catch (AtingiuCapacidadeException e) {
			System.out.println(e.getMessage());
		}

		try {
			postoA.adicionarVeiculo(carroA);
			System.out.println(carroA.toString() + " adicionado(a)!");
		} catch (AtingiuCapacidadeException e) {
			System.out.println(e.getMessage());
		}
		
		/************************************************************/
		System.out.println("");
		/************************************************************/
		
		try {
			postoA.abastecer(motoA, 7, "Gasolina");
		} catch (UltrapassaTanqueException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			postoA.abastecer(motoB, 12, "Etanol");
		} catch (UltrapassaTanqueException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			postoA.abastecer(carroA, 30, "Gasolina");
		} catch (UltrapassaTanqueException e) {
			System.out.println(e.getMessage());
		}
		
		/************************************************************/
		System.out.println("");
		/************************************************************/
		
		System.out.println(motoA.toString() + ": R$ " + postoA.calcularConta(motoA, 7, "Gasolina"));
		System.out.println(motoB.toString() + ": R$ " + postoA.calcularConta(motoB, 12, "Etanol"));
		System.out.println(carroA.toString() + ": R$ " + postoA.calcularConta(carroA, 30, "Gasolina"));
	}

}
