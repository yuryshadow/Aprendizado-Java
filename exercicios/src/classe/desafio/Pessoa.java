package classe.desafio;

public class Pessoa {

	String nome;
	double peso;

	Pessoa() {

	}

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	/*
	double comer(double pesoComida) {
		return peso + pesoComida;
	}
	*/
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + "Kgs.";
	}

}
