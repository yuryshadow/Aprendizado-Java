package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4; //variável normal
		final double PI = 3.14159; //variável constante
		
		double area = PI * raio * raio; //calculando com variáveis
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio *raio;
		System.out.println("Área = " + area + "m2.");
	}
}
