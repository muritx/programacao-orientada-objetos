package aula04;

public class Utils {

	public static String formataCPF(String cpf) { // 04505749388 -> 045.057.493-88
		
		//String cpfFormatado;
		
		//System.out.println(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
		
		//return null;
		
		String parte1 = cpf.substring(0, 3);
		String parte2 = cpf.substring(3, 6);
		String parte3 = cpf.substring(6, 9);
		
		return parte1 + "." + parte2 + "." + parte3 + "-" + cpf.substring(9, 11);
		
	}
	
	/*public static String formataTelefone (String tel) {
		
		String formatado = "(";
		String parte1 = tel.substring(0, 2);
		
		formatado + parte1 + " " +
		
	}*/
	
}
