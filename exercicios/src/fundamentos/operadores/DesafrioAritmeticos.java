package fundamentos.operadores;

public class DesafrioAritmeticos {
	
	public static void main(String[] args) {
		
		//Parte 1
		
		int parteA = 6*(3+2);
		parteA = (int) Math.pow(parteA, 2);
		
		int parteA2 = 3 * 2;
		
		int parteAFinal = parteA / parteA2;
		
		// Parte 2
		
		int parteB = (1-5) * (2-7);
		
		int parteB2 = (int) Math.pow(parteB, 2);
		
		int parteBFinal = parteB2 / 2;
		
		// Parte 3
		
		int parteC =  parteBFinal - parteAFinal ;
		
		int parteC2 = (int) Math.pow(parteC, 3);
		
		// parte 4
		
		int parteD = (int) Math.pow(10, 3);
		
		int parteFinal = parteC2 / parteD;
		
		System.out.println(parteFinal);
		
		
		//Outra forma de resolver o problema
		
		double numA = Math.pow( 6 * ( 3 + 2 ), 2 );
		double denA = 3 * 2;
		
		double numB = ( 1 - 5 ) * ( 2 - 7 );
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow( numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow( 10, 3 );
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
	}
}
