package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// Construtor
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	// Construtor padr�o de forma expl�cita
	Produto() {

	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
