package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//N�o: int -> Double
		
		// BinaryOperator - Recebe dois valores e retorna um
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		//Express�o lambda criada de outra forma
		calc = (x,y) -> x * y;
		
		System.out.println(calc.apply(2.0, 3.0));

		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(2, 3));
		
		calc = (x,y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
