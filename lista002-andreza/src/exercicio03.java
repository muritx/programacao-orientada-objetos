
public class exercicio03 {

	public static void main(String[] args) {
		
		Estado estados[] = new Estado[3];
		
		//PB
		String cidadesPB[] = {"Mamanguape", "Lucena", "Campina Grande"};	
		estados[0] = new Estado("Paraíba", "João Pessoa", cidadesPB, 300000);
		
		//PE
		String cidadesPE[] = {"Caruaru", "Paulista", "Olinda"};
		estados[1] = new Estado("Pernambuco", "Recife", cidadesPE, 400000);
		
		//RN
		String cidadesRN[] = {"Genipabu", "Pipa", "Mossoró"};
		estados[2] = new Estado("Rio Grande do Norte", "Natal", cidadesRN, 500000);

		Pais fronteirasBrasil[] = new Pais[2];
		Pais fronteirasParaguai[] = new Pais[2];
		Pais fronteirasEspanha[] = new Pais[2];
		Pais fronteirasGuianaF[] = new Pais[2];
		
		Pais paisParaguai = new Pais("Paraguai", "Assunção", estados, fronteirasParaguai);
		Pais paisGuianaF = new Pais("Guiana Francesa", "Caiena", estados, fronteirasGuianaF);
		fronteirasBrasil[0] = paisParaguai;
		
		Pais paisBrasil = new Pais("Brasil", "Brasília", estados, fronteirasBrasil);		
		Pais paisEspanha = new Pais("Espanha", "Madrid", estados, fronteirasEspanha);
		
		//Todos os dados do país
		System.out.println(paisBrasil);
		
		//
		System.out.println(paisBrasil.obterQuantidadeCidades());
		
		System.out.println(paisBrasil.obterMaiorEstado());
		
		paisBrasil.exibirFronteiras();

	}

}
