package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4; //vari�vel normal
		final double PI = 3.14159; //vari�vel constante
		
		double area = PI * raio * raio; //calculando com vari�veis
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio *raio;
		System.out.println("�rea = " + area + "m2.");
	}
}
