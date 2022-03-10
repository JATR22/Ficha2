package projetoExtra.Utilizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import projetoExtra.Aplicacao;
import projetoExtra.AplicacaoTipo;

public class Programador extends Utilizador 
{
	private float avaliacao;
	private List <Aplicacao> aplicacoes;
// CUIDADO ao apagar uma aplicação desta lista!
// É necessário apagar também da lista de aplicações da AppStore...

	public Programador(String nome, int idade, int id) {
		super(nome, idade, id);
		this.aplicacoes = new ArrayList<>();
	}
	
	public Aplicacao desenvolverAplicacao (AplicacaoTipo tipo, String nome, double preco)
	{
		return new Aplicacao (tipo, nome, preco, this);
	}
	
	public void adicionarAplicacao (Aplicacao aplicacao)
	{
		aplicacoes.add.(aplicacao);
	}
	
	public void recalcularAvaliacao()
	{
		List<Float> values = aplicacoes.stream()
				.map(Aplicacao::getAvaliacao)
				.filter(Objects::nonNull) // Descarta o valor 'null' 0
				.toList();
		
		float sum = 0;
		
		for (Float value : values)
		{
			sum += value;
		}
		
		avaliacao = sum / values.size();
	}
	
	public double valorTotalRecebido()
	{
		double valorTotal = 0;
		for (Aplicacao aplicacao : aplicacoes)
		{
			int numeroVendas = aplicacao.getNumeroVendas();
			double preco = aplicacao.getPreco();
			valorTotal += numeroVendas * preco;	
		}
		
		return valorTotal;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public List<Aplicacao> getAplicacoesDesenvolvidas() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

}
