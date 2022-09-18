import java.util.HashSet;

public class Posto {

	private int capacidadeMaxVeiculos;
	private HashSet<Veiculo> filaVeiculos;
	private double PrecoGasolina, precoEtanol;
	
	public Posto(int capacidadeMaxVeiculos, HashSet<Veiculo> filaVeiculos, double precoGasolina, double precoEtanol) {
		super();
		this.capacidadeMaxVeiculos = capacidadeMaxVeiculos;
		this.filaVeiculos = (HashSet<Veiculo>) filaVeiculos;
		this.PrecoGasolina = precoGasolina;
		this.precoEtanol = precoEtanol;
	}

	public int getCapacidadeMaxVeiculos() {
		return capacidadeMaxVeiculos;
	}

	public void setCapacidadeMaxVeiculos(int capacidadeMaxVeiculos) {
		this.capacidadeMaxVeiculos = capacidadeMaxVeiculos;
	}

	public HashSet<Veiculo> getFilaVeiculos() {
		return filaVeiculos;
	}

	public void setFilaVeiculos(HashSet<Veiculo> filaVeiculos) {
		this.filaVeiculos = filaVeiculos;
	}

	public double getPrecoGasolina() {
		return PrecoGasolina;
	}

	public void setPrecoGasolina(double precoGasolina) {
		PrecoGasolina = precoGasolina;
	}

	public double getPrecoEtanol() {
		return precoEtanol;
	}

	public void setPrecoEtanol(double precoEtanol) {
		this.precoEtanol = precoEtanol;
	}
	
	public void adicionarVeiculo(Veiculo v) throws AtingiuCapacidadeException {

		if (estaCheio()) {
			throw new AtingiuCapacidadeException();
		}
		
		this.filaVeiculos.add(v); 

	}
	
	public void abastecer(Veiculo v, int litros, String tipoCombustivel) throws UltrapassaTanqueException {

		if (this.filaVeiculos.contains(v)) {
			
			if (v.getCapacidadeMaxTanque() < (v.getCapacidadeAtualTanque() + litros)) {
				System.out.print(v.toString() + ": "); throw new UltrapassaTanqueException();

			} else {
				v.setCapacidadeAtualTanque(getCapacidadeMaxVeiculos() + litros);
				System.out.println(v.toString() + ": veículo abastecido!");
			}
		}

	}
	
	public boolean estaCheio()  {
		
		if (this.capacidadeMaxVeiculos > this.filaVeiculos.size()) {
			return false;
		}
		
		return true;
		
	}
	
	public Double calcularConta(Veiculo v, int litros, String tipoCombustivel) {

		if (this.filaVeiculos.contains(v)) {

			if (tipoCombustivel.equals("Gasolina") || tipoCombustivel.equals("gasolina")) {
				this.filaVeiculos.remove(v);
				return litros * this.PrecoGasolina;

			} else if (tipoCombustivel.equals("Etanol") || tipoCombustivel.equals("etanol")) {
				this.filaVeiculos.remove(v);
				return litros * this.precoEtanol;
			}
			
		}

		return null;
		
	}
	
}
