package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		AlunoUniversidade a1 = new AlunoUniversidade("Maria", "Pedagogia", 3, false);
		AlunoUniversidade a2 = new AlunoUniversidade("Jose", "TI", 3, true);
		AlunoUniversidade a3 = new AlunoUniversidade("Mateus", "Gestão de RH", 3, false);
		AlunoUniversidade a4 = new AlunoUniversidade("Flavia", "Ciencias Economicas", 3, true);
		AlunoUniversidade a5 = new AlunoUniversidade("Raquel", "Segurança no trabalho", 3, false);
		AlunoUniversidade a6 = new AlunoUniversidade("Josefa", "Matemática", 3, true);
		
		List<AlunoUniversidade> alunosUniversidade = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<AlunoUniversidade> rematriculado = a -> a.fezRematricula;
		Function<AlunoUniversidade, String> fezRematricula = 
				a -> "O aluno(a) " + a.nome + " rematriculado!";
				
		alunosUniversidade.stream()
		.filter(rematriculado)
		.map(fezRematricula)
		.forEach(System.out::println);
	}
}
