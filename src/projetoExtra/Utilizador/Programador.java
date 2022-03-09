package projetoExtra.Utilizador;

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
	
	public Aplicacao desenvolverAplicacao (TipoAplicacao tipo, String nome, double preco)
	{
		return new Aplicacao (tipo, nome, preco, this);
	}
	
	public void adicionarAplicacao (Aplicacao aplicacao)
	{
		aplicacoes.add.(aplicacao);
	}

}
