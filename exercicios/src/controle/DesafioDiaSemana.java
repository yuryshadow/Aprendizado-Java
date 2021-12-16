package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");

		String dia = entrada.next().toLowerCase();

		if (dia.equals("segunda") || dia.equals("segunda-feira")) {
			System.out.println("Segundo dia da semana !!");
		} else if (dia.equals("terça") || dia.equals("terça-feira")) {
			System.out.println("Terceiro dia da semana !!");
		} else if (dia.equals("quarta") || dia.equals("quarta-feira")) {
			System.out.println("Quarto dia da semana !!");
		} else if (dia.equals("quinta") || dia.equals("quinta-feira")) {
			System.out.println("Quinto dia da semana !!");
		} else if (dia.equals("sexta") || dia.equals("sexta-feira")) {
			System.out.println("Sexto dia da semana !!");
		} else if (dia.equals("sábado")){
			System.out.println("Sétimo dia da semana !!");
		} else if (dia.equals("domingo")){
			System.out.println("Primeiro dia da semana !!");
		}else {
			System.out.println("Dia inválido, por favor tente de novo !!");
		}
	}
}
