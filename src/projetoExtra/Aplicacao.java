package projetoExtra;

import java.util.HashMap;

import laboratorio_ProjetoExtra_Ligia.Avaliacao;
import projetoExtra.Utilizador.Programador;

public class Aplicacao 
{
	private String nome;
	private double preco;
	private float avaliacao;
	private HashMap<Integer, Avaliacao> mapaAvaliacoes;
	private AplicacaoTipo tipo;
	private Programador programador;
	private int numeroVendas;
	
	
	public Aplicacao(String nome, double preco, float avaliacao, HashMap<Integer, Avaliacao> mapaAvaliacoes,
			AplicacaoTipo tipo, Programador programador, int numeroVendas) 
	{
		this.nome = nome;
		this.preco = preco;
		this.avaliacao = avaliacao;
		this.mapaAvaliacoes = new HashMap<>();
		this.tipo = tipo;
		this.programador = programador;
		this.numeroVendas = 0;
	}
	
	public void avaliar (int utilizadorId, float classificacao)
	{
		mapaAvaliacoes.put(utilizadorId, new Avaliacao (classificacao));
		recalcularAvaliacao();
		programador.recalcularAvaliacao();
	}
	
	 public void avaliar(int utilizadorId, float classificacao, String comentario) {
	        mapaAvaliacoes.put(utilizadorId, new Avaliacao(classificacao, comentario));
	        recalcularAvaliacao();
	        programador.recalcularAvaliacao();
	 }
	
//	private void recalcularAvaliacao()
//	{
	

}
