package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {

		// Macarrão
		Comida c1 = new Comida();
		c1.nome = "Macarrão";
		c1.peso = 1.5;
		
		// Feijoada
		Comida c2 = new Comida();
		c2.nome = "Feijoada";
		c2.peso = 2.5;
		
		// Cadastrando Yuri
		Pessoa p1 = new Pessoa("Yuri", 75.0);
		
		/*
		System.out.println(p1.peso);

		p1.peso = p1.comer(c1.peso);
		p1.peso = p1.comer(c2.peso);
		
		System.out.println(p1.peso);
		*/
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
	
	}

}
