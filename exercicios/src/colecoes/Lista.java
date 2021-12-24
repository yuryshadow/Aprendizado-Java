package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // Acessar pelo indice
		
		System.out.println(">>> " + lista.remove(1)); // Remover da lista
		
		System.out.println(lista.remove(new Usuario("Manu"))); // Outra forma de remover a lista
		
		System.out.println("Tem ? " + lista.contains(new Usuario("Lia"))); // Verificar se contém o nome
		
		// Percorrer a lista
		for (Usuario u : lista) {
			System.out.println(u);
		}
	}
}
