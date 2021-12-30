package oo.polimorfismo;

public abstract class Comida {

	protected double peso;

	public Comida(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0.0) {
			this.peso = peso;		
		}
	}
	
}
