package projetoExtra;

public class Avaliacao 
{
	private float classificacao;
	private String comentario;
	
	// Dois construtores, dado que o comentário por parte do utilizador é opcional!
	public Avaliacao (float classificacao, String comentario)
	{
		this.classificacao = classificacao;
		this.comentario = comentario;
	}
	
	public Avaliacao(float classificacao) 
	{
		this.classificacao = classificacao;
    }
	
/*	@Override
	public String toString() 
	{
		return "Avaliacao{" +
				"classificacao=" + classificacao +
				", comentario='" + comentario + '\'' +
				'}'; */
	
	public float getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(float classificacao) {
		this.classificacao = classificacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}	
	
}
