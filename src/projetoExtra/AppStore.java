package projetoExtra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import projetoExtra.Utilizador.Cliente;
import projetoExtra.Utilizador.Programador;
import projetoExtra.Utilizador.Utilizador;

public class AppStore 
{
	private List <Aplicacao> aplicacoes;
	private List <Utilizador> utilizadores;
	
	public AppStore()
	{
		aplicacoes = new ArrayList<>();
		utilizadores = new ArrayList<>();
	}
	
	public void registarUtilizador (Utilizador Utilizador)
	{
		utilizadores.add (Utilizador);
	}

	public void adicionarAplicacao (Aplicacao aplicacao)
	{
		aplicacoes.add (aplicacao);
		aplicacao.getProgramador().adicionarAplicacao(aplicacao);
	}
	
// Instanciamento de uma nova compra e adi��o da mesma, na lista de compras da classe Cliente.
	
	public void comprarAplicacoes (Cliente cliente, List<Aplicacao> aplicacoes)
	{
		Compra compra = new Compra (cliente, aplicacoes);
		cliente.adicionarCompra(compra);
	}
	
	public List<Aplicacao> getAplicacoesPorCategoria (AplicacaoTipo tipo)
	{
		return aplicacoes.stream()
				.filter(aplicacao -> aplicacao.getTipo() == tipo)
				.toList();
	}
	
// N�o � poss�vel obter uma igualdade de classifica��o (tendo em conta que � float)...
// Logo, a op��o passa por buscar as APPS, de classifica��o igual ou superior.
	
	public List <Aplicacao> getAplicacoesPorClassificacao (float classificacaoMinima)
	{
		return aplicacoes.stream()
				.filter(aplicacao -> aplicacao.getAvaliacao() >= classificacaoMinima)
				.toList();
	}
	
	// Reordena��o de lista... Necess�rio devolver a lista!
	public List <Aplicacao> listarPorNome()
	{
		aplicacoes.sort(Comparator.comparing(Aplicacao::getNome));
		return aplicacoes;
	}
	
	// Reordena��o de lista... Necess�rio devolver a lista!
	public List <Aplicacao> listarPorNumeroVendas()
	{
		aplicacoes.sort(Comparator.comparing(Aplicacao::getNumeroVendas).reversed());
		return aplicacoes;
	}
	
	// Reordena��o de lista... Necess�rio devolver a lista!
	public List <Aplicacao> listarPorClassificacao()
	{
		aplicacoes.sort (Comparator.comparing(Aplicacao::getAvaliacao).reversed());
		return aplicacoes;
	}
	
	
	public List <Aplicacao> listarAplicacoes (Utilizador utilizador)
	{
		if (utilizador instanceof Cliente)
		{
			return ((Cliente) utilizador).getAplicacoesCompradas();
		}
		if (utilizador instanceof Programador)
		{
			return ((Programador) utilizador).getAplicacoesDesenvolvidas();
		}
		return null;
	}
	
	public double getValorTotalCompras()
	{
		List <Cliente> clientes = utilizadores.stream()
				.filter(utilizador -> utilizador instanceof Cliente)
				.map(utilizador -> (Cliente) utilizador)
				.toList();
		
		List <Compra> compras = new ArrayList<> ();
		for (Cliente cliente : clientes)
		{
			compras.addAll(cliente.getCompras());
		}
		
		double valorCompras = 0;
		for (Compra compra : compras)
		{
			valorCompras += compra.getPreco();
		}
		
		return valorCompras;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder ("AppStore{\n aplica��es= [");
		for (Aplicacao aplicacao : aplicacoes)
		{
			output.append ("\n ").append(aplicacao);
		}
		return output + "\n ]\n}";
	} 

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

	public List<Utilizador> getUtilizadores() {
		return utilizadores;
	}

	public void setUtilizadores(List<Utilizador> utilizadores) {
		this.utilizadores = utilizadores;
	}
	

}
