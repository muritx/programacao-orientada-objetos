package classesAbstratas;

public class Quadrado extends Poligono {
	
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		return this.lado * this.lado;
	}

}
