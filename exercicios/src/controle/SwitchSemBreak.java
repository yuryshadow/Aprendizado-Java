package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase() ) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekkii shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verda":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandani...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim !\n");
		
		int idade = 1;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}
}
