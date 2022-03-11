package projetoExtra;

import java.util.Arrays;
import java.util.List;

import projetoExtra.Utilizador.Cliente;
import projetoExtra.Utilizador.Programador;
import projetoExtra.Utilizador.Utilizador;


public class Consola {
	public static void main(String[] args)
	{
		imprimirTituloExercicio("Registar novos utilizadores e atribuir "
								+ "automaticamente números únicos");
		Programador programador1 = new Programador ("Nolan", 35);
		Programador programador2 = new Programador ("William", 28);
		Programador programador3 = new Programador ("Takeshi", 24);
		Programador programador4 = new Programador ("Kakashi", 22);
		
		Cliente cliente1 = new Cliente ("Cipriano", 40);
		Cliente cliente2 = new Cliente ("Gervásio", 31);
		Cliente cliente3 = new Cliente ("Carol", 26);
		Cliente cliente4 = new Cliente ("Elisa", 23);
		Cliente cliente5 = new Cliente ("Tibúrcio", 35);
		
		AppStore loja1 = new AppStore();
		loja1.registarUtilizador(programador1);
		System.out.println(programador1);
		
		loja1.registarUtilizador(programador2);
		System.out.println(programador2);

		loja1.registarUtilizador(programador3);
		System.out.println(programador3);
		
		loja1.registarUtilizador(programador4);
		System.out.println(programador4);
		
		loja1.registarUtilizador(cliente1);
		System.out.println(cliente1);

		loja1.registarUtilizador(cliente2);
		System.out.println(cliente2);

		loja1.registarUtilizador(cliente3);
		System.out.println(cliente3);

		loja1.registarUtilizador(cliente4);
		System.out.println(cliente4);

		loja1.registarUtilizador(cliente5);
		System.out.println(cliente5);
		
		
		imprimirTituloExercicio ("Incluir novas aplicações com a informação necessária");
		// Adição de aplicações à AppStore
		Aplicacao aplicacao1 = programador1.desenvolverAplicacao(AplicacaoTipo.GAMES, "SEKIRO", 49.99);
		loja1.adicionarAplicacao(aplicacao1);
		Aplicacao aplicacao2 = programador2.desenvolverAplicacao(AplicacaoTipo.GAMES, "Uncharted", 19.95);
		loja1.adicionarAplicacao(aplicacao2);
		Aplicacao aplicacao3 = programador3.desenvolverAplicacao(AplicacaoTipo.GAMES, "Elden Ring", 69.99);
		loja1.adicionarAplicacao(aplicacao3);
		Aplicacao aplicacao4 = programador4.desenvolverAplicacao(AplicacaoTipo.ENTERTAINMENT, "CrunchyRoll", 7.90);
		loja1.adicionarAplicacao(aplicacao4);
		
		
		System.out.println (loja1);
		
		
		imprimirTituloExercicio("Listar todos os utilizador da App Store"
				+ "\nPara cada um é apresentado o nome, idade e número de utilizador");
		StringBuilder utilizadores = new StringBuilder ("Utilizadores\n");
		for (int i = 0; i < loja1.getUtilizadores().size(); i++)
		{
			Utilizador utilizador = loja1.getUtilizadores().get(i);
			
			utilizadores.append ("\n ").append (utilizador);
		}
		
		System.out.println (utilizadores + "\n");
		
		
		imprimirTituloExercicio("Realizar compras das aplicações");
		loja1.comprarAplicacoes(cliente1, Arrays.asList(aplicacao1, aplicacao4));
        loja1.comprarAplicacoes(cliente2, Arrays.asList(aplicacao2, aplicacao3));
        loja1.comprarAplicacoes(cliente3, Arrays.asList(aplicacao3, aplicacao4));

        imprimirCompra(cliente1.getId(), cliente1.getNome(), cliente1.getAplicacoesCompradas());
        imprimirCompra(cliente2.getId(), cliente2.getNome(), cliente2.getAplicacoesCompradas());
        imprimirCompra(cliente3.getId(), cliente3.getNome(), cliente3.getAplicacoesCompradas());
     
        
        
        
        imprimirTituloExercicio("Atribuir a uma aplicação uma avaliação (e comentários) dados por um utilizador e atualizar a classificação do programador e da aplicação");
        aplicacao1.avaliar(5, 5, "Excelente jogabilidade!");
        aplicacao1.avaliar(5, 5);
        System.out.println(aplicacao1.getNome() + " -> " + aplicacao1.getAvaliacao());

        aplicacao2.avaliar(4, 4, "Storyline muito boa.");

        aplicacao3.avaliar(5, 5);
        System.out.println(aplicacao3.getNome() + " -> " + aplicacao3.getAvaliacao());

        aplicacao4.avaliar(5, 3);
        System.out.println(aplicacao4.getNome() + " -> " + aplicacao4.getAvaliacao());

        System.out.println("\nAvaliação programador:\n" + programador1.getNome() + " -> " + programador1.getAvaliacao());

		
        imprimirTituloExercicio("Lista de Apps após rating");
        System.out.println(loja1);

        imprimirTituloExercicio("Listar avaliações");
        System.out.println(aplicacao1.listarAvaliacoes());
        System.out.println(aplicacao2.listarAvaliacoes());
        System.out.println(aplicacao3.listarAvaliacoes());
        System.out.println(aplicacao4.listarAvaliacoes());

        System.out.println("Programador 1: " + programador1.getNome() + ", avaliação: " + programador1.getAvaliacao());
        
        
        imprimirTituloExercicio("Fazer listagens seletivas das apps por categoria");
        System.out.println(loja1.getAplicacoesPorCategoria(AplicacaoTipo.GAMES));
        System.out.println(loja1.getAplicacoesPorCategoria(AplicacaoTipo.ENTERTAINMENT));


        imprimirTituloExercicio("Fazer listagens seletivas das apps por classificação dos utilizadores");
        System.out.println(loja1.getAplicacoesPorClassificacao(3));
        loja1.getAplicacoesPorClassificacao(3).forEach(aplicacao -> System.out.println(aplicacao.getAvaliacao()));

        imprimirTituloExercicio("Fazer listagens ordenadas das apps por nome");
        System.out.println(loja1.listarPorNome());
        loja1.listarPorNome().forEach(aplicacao -> System.out.println(aplicacao.getNome()));

        imprimirTituloExercicio("Fazer listagens ordenadas das apps por número de vendas");
        System.out.println(loja1.listarPorNumeroVendas());
        loja1.getAplicacoes().forEach(aplicacao -> System.out.println(aplicacao.getNome() + "-> Vendas: " + aplicacao.getNumeroVendas()));

        imprimirTituloExercicio("Fazer listagens ordenadas das APPS por classificação dos utilizadores");
        System.out.println(loja1.listarPorClassificacao());
        loja1.listarPorClassificacao().forEach(aplicacao -> System.out.println(aplicacao.getNome() + " -> avaliação: " + aplicacao.getAvaliacao()));

        imprimirTituloExercicio("Listar as aplicações de um utilizador em concreto (independentemente de ser cliente ou programador");
        System.out.println("Cliente " + cliente1.getNome() +  " -> " + cliente1.getAplicacoesCompradas());
        System.out.println("Programador " + programador1.getNome() + " -> " + programador1.getAplicacoesDesenvolvidas());
    }


	private static void imprimirTituloExercicio(String titulo) 
	{
		System.out.println("\n- " + titulo + ".\n");
	}
	
	private static void imprimirCompra (int clienteId, String nome, List<Aplicacao> appsAdquiridas)
	{
		System.out.println("ID: " + clienteId + ", nome: " + nome 
				+ "\nLista de aplicações compradas:\n" + appsAdquiridas + "\n");
	}

}
