package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data hoje = new Data();
		hoje.dia = 17;
		hoje.mes = 12;
		hoje.ano = 2021;

		Data nasc = new Data();
		nasc.dia = 27;
		nasc.mes = 04;
		nasc.ano = 1994;

		Data casamento = new Data(4, 4, 2022);

		// String dataFormatada = hoje.obterDataFormatada();

		Data padrao = new Data();

		casamento.imprimirDataFormatada();
		padrao.imprimirDataFormatada();
		hoje.imprimirDataFormatada();
		nasc.imprimirDataFormatada();
	}

}
