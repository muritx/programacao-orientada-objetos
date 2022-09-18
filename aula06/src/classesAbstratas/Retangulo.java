package classesAbstratas;

public class Retangulo extends Poligono {
	
	private double base, altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	protected double calcArea() {
		return this.base * this.altura;
	}	

}
