package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print; // Criando uma função da interface Constumer para guardar o método
		Consumer<Integer> println = System.out::print; // Criando uma função da interface Constumer para guardar o método
													// print

		Stream<String> lags = Stream.of("Java ", "Lua ", "JS\n");
		lags.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); // Mostra a partir do índice 1 até o 4 mas não mostra o 4

		List<String> outrasLags = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLags.stream().forEach(print);
		outrasLags.parallelStream().forEach(print); // Mostrar valores mostrados em sequencia diferentes
		
		//Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
		
		
	}
}
