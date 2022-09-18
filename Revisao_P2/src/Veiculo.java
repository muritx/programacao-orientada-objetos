
public abstract class Veiculo {
	
	private int capacidadeMaxTanque, capacidadeAtualTanque;

	public Veiculo(int capacidadeMaxTanque, int capacidadeAtualTanque) {
		super();
		this.capacidadeMaxTanque = capacidadeMaxTanque;
		this.capacidadeAtualTanque = capacidadeAtualTanque;
	}

	public int getCapacidadeMaxTanque() {
		return capacidadeMaxTanque;
	}

	public void setCapacidadeMaxTanque(int capacidadeMaxTanque) {
		this.capacidadeMaxTanque = capacidadeMaxTanque;
	}

	public int getCapacidadeAtualTanque() {
		return capacidadeAtualTanque;
	}

	public void setCapacidadeAtualTanque(int capacidadeAtualTanque) {
		this.capacidadeAtualTanque = capacidadeAtualTanque;
	}

}
