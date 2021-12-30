package oo.heranca.desafio;

public class Carro {

	boolean ligado = false;
	double velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	private double delta = 5;
	
	public void ligar() {
		if(ligado == false) {
			ligado = true;
		}else {
			ligado = false;
		}
	}
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(){
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if(velocidadeAtual <= delta) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= delta;
		}
	}
	
	void velocidadeAtual() {
		System.out.println("Velocidade atual do carro: " + velocidadeAtual + "Km/h");
	}

	public void ligarTurbo() {
		// TODO Auto-generated method stub
		
	}

	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}
	
}
