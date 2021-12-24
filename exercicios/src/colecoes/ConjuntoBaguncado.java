package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); //Criar um conjunto 
		
		// Adicionar conjuntos
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		//Mostrar tamanho do conjunto
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('X');
		System.out.println("Tamanho é " + conjunto.size());
		
		//Remover objeto do conjunto
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Teste");
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//Verificar se o conjunto contem o valor x
		System.out.println(conjunto.contains('x'));
		
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Unir dois conjuntos
		
		conjunto.retainAll(nums); // Mantem apenas os números que estão nos dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpar conjunto
	}
}
