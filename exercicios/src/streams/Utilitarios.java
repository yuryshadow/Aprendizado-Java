package streams;

import java.util.function.UnaryOperator;

	// A classe utilitários foi criada criar pequenas funções e disponibilizar ela para mais partes do programa
public class Utilitarios {
	
	// Construtores privados não deixam estanciar a classe
	private Utilitarios(){
		
	}

	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";
	
	public final static String grito(String n){
		return n + "!!!";
	}
	
}
