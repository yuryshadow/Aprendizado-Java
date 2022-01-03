package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print; // Criando uma fun��o da interface Constumer para guardar o m�todo
		Consumer<Integer> println = System.out::print; // Criando uma fun��o da interface Constumer para guardar o m�todo
													// print

		Stream<String> lags = Stream.of("Java ", "Lua ", "JS\n");
		lags.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); // Mostra a partir do �ndice 1 at� o 4 mas n�o mostra o 4

		List<String> outrasLags = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLags.stream().forEach(print);
		outrasLags.parallelStream().forEach(print); // Mostrar valores mostrados em sequencia diferentes
		
		//Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
		
		
	}
}
