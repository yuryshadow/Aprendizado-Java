package oo.heranca.desafio;

public class Civic extends Carro{
	
	public Civic() {
		super(212);
	}

	public void acelerar(){
		if(ligado != false) {
			velocidadeAtual += 10.0;
		}
	}
	
	public void frear() {
		if(velocidadeAtual <= 5) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= 15.0;
		}
	}
	
	public void velocidadeAtual() {
		System.out.println("Velocidade atual do Civic está em : " + velocidadeAtual + "Km/h");
	}
	
}
