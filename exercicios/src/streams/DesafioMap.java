package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> binarioParaInt =
				s -> Integer.parseInt(s,2);
				
				
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);;		
		
		
		
		/*
		 * 1. N�mero para String bin�ria...
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * 
		 * Integer.
		 */
		
		//Converter inteiro para bin�rio
		//b=Integer.toBinaryString(x);
		
		//Converter bin�rio para inteiro
		//System.out.println("conferindo:"+Integer.parseInt(b,2));

		
		
	}
}
