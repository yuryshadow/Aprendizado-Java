package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Entrada de dados
		System.out.print("Insira o Primeiro sal�rio: ");
		String salario1 = teclado.next();
		System.out.print("Insira o Segundo sal�rio: ");
		String salario2 = teclado.next();
		System.out.print("Insira o Terceiro sal�rio: ");
		String salario3 = teclado.next();
		
		// Convertendo string para numero
		double numero1 = Double.parseDouble(salario1.replace(",", "."));
		double numero2 = Double.parseDouble(salario2.replace(",", "."));
		double numero3 = Double.parseDouble(salario3.replace(",", "."));
		
		// Calculando valores
		double soma = numero1 + numero2 + numero3;
		double media = (numero1 + numero2 + numero3)/3;
		
		// Mostrando valores		
		System.out.printf("%nA soma dos salarios � %.1f e a m�dia � %.1f", soma, media);

		
		teclado.close();
		
	}
}
