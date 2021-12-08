package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C

		double c;
		final double AJUSTE = 32.0;
		final double FATOR = 5.0 / 9.0;

		double f = 86;
		c = (f - AJUSTE) * FATOR;
		System.out.printf("O valor em C° é: " + c + "°C.\n");

		f = 150;
		c = (f - AJUSTE) * FATOR;

		System.out.printf("O valor em C° é: " + c + "°C.");
	}
}
