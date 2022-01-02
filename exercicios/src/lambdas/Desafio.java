package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto ("iPad", 3235.89, 0.0);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) < 2500 (Isento)
		 * 3. Frete >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */

		
		// Verificando preço real
		System.out.print("Preço real: ");
		BinaryOperator<Double> precoReal = (Double n1, Double n2) -> n1 - (n1 * n2);
		System.out.println(precoReal.apply(p.preco, p.desconto));
		
		
		// Verificando se tem imposto
		System.out.println("Tem imposto ? ");
		Function<Double, String> isImposto = num -> num < 2500 ?  "Não tem imposto" : "Sim de 8,5";;
		
		String imposto = precoReal
				.andThen(isImposto)
				.apply(p.preco, p.desconto);
		
		System.out.println(imposto);
		
		// Verificando o valor do frete
		System.out.println("Valor do Frete: ");
		Function<Double, String> isFrete = num -> num < 3000 ? "R$ 50,00" : "100";;
		
		String frete = precoReal
				.andThen(isFrete)
				.apply(p.preco, p.desconto);
		
		System.out.println(frete);
		
		// Calculo total
		
		System.out.println("O valor total fica: ");
		
		Function<Double, Double> isValorImposto = num -> num < 2500.0 ? num : num * 8.5;
		Function<Double, Double> isValorFrete = num -> num < 3000.0 ? num + 50 : num + 100;
		Function<Double, Double> arrendondarMedia = num -> Math.round(num * 100.0)/100.0;
		Function<Double, String> removerPonto = num -> String.valueOf(num).replace(".", ",");		
		Function<String, String> formatarValores = num -> "R$ " + num;
		
		String valorTotal = precoReal
				.andThen(isValorImposto)
				.andThen(isValorFrete)
				.andThen(arrendondarMedia)
				.andThen(removerPonto)
				.andThen(formatarValores)
				.apply(p.preco, p.desconto);
		
		System.out.println(valorTotal);
		
		
	}
}
