package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exece��o N�O checada ou n�o verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}

	// Exce��o checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
