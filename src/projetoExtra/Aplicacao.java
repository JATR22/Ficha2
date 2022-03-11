package projetoExtra;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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
	
	
	public Aplicacao(String nome, double preco, AplicacaoTipo tipo, Programador programador) 
	{
		this.nome = nome;
		this.preco = preco;
		this.mapaAvaliacoes = new HashMap<>();
		this.tipo = tipo;
		this.programador = programador;
		int Random = 200000;
		this.numeroVendas = Random;
	}
	
	public void avaliar (int utilizadorId, float classificacao)
	{
		mapaAvaliacoes.put(utilizadorId, new Avaliacao (classificacao));
		recalcularAvaliacao();
		programador.recalcularAvaliacao();
	}
	
	 public void avaliar(int utilizadorId, float classificacao, String comentario) 
	 {
	        mapaAvaliacoes.put(utilizadorId, new Avaliacao(classificacao, comentario));
	        recalcularAvaliacao();
	        programador.recalcularAvaliacao();
	 }
	
	 private void recalcularAvaliacao()
	{
		 Collection<Avaliacao> values = mapaAvaliacoes.values();
		 
		 float sum = 0;
		 
		 for (Avaliacao avaliacao : values)
		 {
			 sum += avaliacao.getClassificacao();
		 }
		 
		 avaliacao = sum / mapaAvaliacoes.keySet().size();
	
	}
	 
	 public void adicionarVenda()
	 {
		 numeroVendas++;
	 }
	 
	 public List<Avaliacao> listarAvaliacoes()
	 {
		 return mapaAvaliacoes.values().stream().toList(); 
	 }
	 
	 @Override
	    public String toString() {
	        return "Aplicacao{" +
	                "tipo=" + tipo +
	                ", nome='" + nome +
	                ", preco=" + preco +
	                ", classificacao=" + avaliacao +
	                '}'; 
	 }
	 
	   
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public AplicacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(AplicacaoTipo tipo) {
		this.tipo = tipo;
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
	  

}
