package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Deseja informar quantas notas ? ");
		int notas = entrada.nextInt();

		System.out.println();

		double[] notasAluno = new double[notas];

		for (int i = 0; i < notas; i++) {
			System.out.print("Insira a nota do aluno com o RA " + i + " : ");
			notasAluno[i] = entrada.nextDouble();
		}

		System.out.println();

		double media = 0;
		for (double d : notasAluno) {
			media += d;
		}

		System.out.println("A média das notas é: " + media / notas);

		entrada.close();
	}
}
