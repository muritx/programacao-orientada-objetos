package classesAbstratas;

public class Principal {

	public static void main(String[] args) {
		
		Poligono pol1 = new Triangulo(10, 20);
		System.out.println(pol1.calcArea());
		
		Poligono pol2 = new Quadrado(15);
		System.out.println(pol2.calcArea());
		
		Poligono pol3 = new Retangulo(12, 16);
		System.out.println(pol3.calcArea());

	}

}
