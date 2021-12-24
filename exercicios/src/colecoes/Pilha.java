package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		for (String livro : livros) {
			System.out.println(livro);
		}

		livros.add("O Pequeno Pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop());
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
		
	}
}
