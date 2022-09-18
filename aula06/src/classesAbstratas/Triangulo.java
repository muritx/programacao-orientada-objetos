package classesAbstratas;

public class Triangulo extends Poligono {
	
	private double base, altura;
		
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public double calcArea() {
		return (this.base * this.altura) / 2;
	}

}