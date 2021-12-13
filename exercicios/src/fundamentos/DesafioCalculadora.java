package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

		public static void main(String[] args) {
			// Ler num1
			// Ler num2
			// + - * / %
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite a primeira nota: ");
			double num1 = entrada.nextDouble();
			
			System.out.print("Digite a Segunda nota: ");
			double num2 = entrada.nextDouble();
			
			System.out.print("Digite a operação: ");
			String operacao = entrada.next();
			
			double resultado = (operacao.equals("+")) ? num1 + num2:
								(operacao.equals("-")) ? num1 - num2:
									 (operacao.equals("*")) ? num1 * num2:
										 (operacao.equals("/")) ? num1 / num2:
											 (operacao.equals("%")) ? num1 % num2:
												 0;
			
			System.out.println(resultado);
			
		
			
			// Outra forma de resolver o problema
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Digite a primeira nota: ");
			double numero1 = entrada.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
			double numero2 = entrada.nextDouble();
			
			System.out.print("Informe a operação: ");
			String op = entrada.next();
			
			// Lógica
			
			double resultado2 = "+".equals(op) ? num1 + num2 : 0;
			resultado2 = "+".equals(op) ? num1 + num2 : resultado2;
			resultado2 = "*".equals(op) ? num1 * num2 : resultado2;
			resultado2 = "/".equals(op) ? num1 / num2 : resultado2;
			resultado2 = "%".equals(op) ? num1 % num2 : resultado2;
			
			System.out.printf("%.2f %s %.wf = %2.f",
					num1, op, num2, resultado2);
			entrada.close();
		}
}
