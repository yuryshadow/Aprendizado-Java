package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		// Variáveis
		int sair = 0;
		double nota = 0;
		double total = 0;
		int contagem = 0;
		
		
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//Lógica
		do {
			contagem = contagem + 1;
			
			System.out.print("\n-------------------------\n"
					+ "Insira a nota do aluno: ");
			nota = entrada.nextDouble();
			
			if(nota < -2 || nota > 10) {
				System.out.println("\nNota inválida por favor tente novamente");

			}else if (nota == -1.0){
				sair = -1;
			}else {
				total = (total + nota)/contagem;
				
			}
			
		} while (sair != -1);
		System.out.println(total);
		
		entrada.close();
	}
}
