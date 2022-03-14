package ficha5;

public class Main {

	public static void main(String[] args) {

		Pessoa baltazar = new Pessoa("Baltazar", "Jesus", 41, 800);
		Pessoa isaias = new Pessoa("Isaías", "Aveiro", 38, 1200.5);

		System.out.println("Dados do Baltazar: " + baltazar);
		System.out.println("ID do Baltazar: " + baltazar.getId());

		System.out.println("\nDados da Isaías: " + isaias);
		System.out.println("ID do Isaías: " + isaias.getId());

		Mercado mercado = new Mercado("Lavradores");

		mercado.inserirPessoa(baltazar);
		mercado.inserirPessoa(isaias);
		baltazar.setSaldo(850);
		isaias.setSaldo(1300);

		System.out.println("\nValor total acumulado: " + mercado.valorTotalAcumulado());

		//

		LoadFromFile loadFFile = new LoadFromFile();

		mercado.inserirPessoaJson(loadFFile.obterInformacaoFicheiro("Pessoas.json"));

		System.out.println(mercado);
	}

}