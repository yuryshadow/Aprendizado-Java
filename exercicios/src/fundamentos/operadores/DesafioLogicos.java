package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		// Resolvendo problema do meu jeito
		System.out.println("TRABALHOS");
		System.out.println("Trabalho de terça: " + trabalho1);
		System.out.println("Trabalho de quinta: " + trabalho2);
		System.out.println("-------------------------------------------");
		
		System.out.println("TVS COMPRADAS");
		boolean tv32 = trabalho1 || trabalho2;
		boolean tv52 = trabalho1 && trabalho2;
		tv32 = (tv32 && tv52);
		System.out.println("TV de 32\":  " + tv32);
		System.out.println("TV de 52\": " + tv52);
		
		System.out.println("-------------------------------------------");
		System.out.println("TOMAR SORVETE");
		System.out.println(trabalho1 || trabalho2);
		
		
		System.out.println("\n---------Outro modo de resolver-----------\n");
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		
		// Operador Unário !
		System.out.println("Mais saudável? " + !comprouSorvete);		
	}
}
