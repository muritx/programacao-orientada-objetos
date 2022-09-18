
public class Loja {

	public static void main(String[] args) {

		Produto livro1 = new Livro("Misery: Louca obsessão", 29.83, "Stephen King");
		Produto cd1 = new CD("Life is Yours", 90.90, 11);
		Produto dvd1 = new DVD("Shrek 2", 34.90, 93);
		
		livro1.locar();
		System.out.println(livro1.toString());
		
		cd1.locar();
		System.out.println(cd1.toString());
		
		dvd1.locar();
		System.out.println(dvd1.toString());
		
		System.out.println("Valor total do pedido: R$ " + calcularTotal(livro1, cd1, dvd1));
		
	}
	
	public static double calcularTotal(Produto produto1, Produto produto2, Produto produto3) {
		
		return produto1.preco + produto2.preco + produto3.preco;
		
	}

}
