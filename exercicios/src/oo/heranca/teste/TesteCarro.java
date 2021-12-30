package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Ferrari c2 = new Ferrari(120);
		
		
		
		c2.ligar();
		
		c2.acelerar();
		
		c2.velocidadeAtual();
		
		c2.acelerar();
		c2.ligar();
		c2.acelerar();
		
		c2.velocidadeAtual();
		
		c2.frear();
		c2.frear();
	
		
		c2.velocidadeAtual();
		
		Civic c1 = new Civic();
		
		c1.ligar();
		
		c1.velocidadeAtual();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		c1.velocidadeAtual();
	}
}
