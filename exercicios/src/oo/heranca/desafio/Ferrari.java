package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(5);
	}

	/*
	 * void acelerar(){ if(ligado != false) { velocidadeAtual += 15.0; } }
	 */

	public void frear() {
		if (velocidadeAtual <= 5) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= 15.0;
		}
	}

	public void velocidadeAtual() {
		System.out.println("Velocidade atual da Ferrari está em : " + velocidadeAtual + "Km/h");
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	public double getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 15;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			
		}return 15;
	}

}
