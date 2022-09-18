package utilitarios;

public class Principal {

	public static void main(String[] args) {
		
		Poligono p = new Triangulo(2, 10);
		System.out.println(p.calcArea());
		
		calculaArea(p);

	}
	
	public static void calculaArea(Poligono p) {
		System.out.println(p.calcArea());
	}

}
