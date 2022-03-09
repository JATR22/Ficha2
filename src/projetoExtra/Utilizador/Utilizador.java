package projetoExtra.Utilizador;

public class Utilizador {
	private String nome;
	private int idade;
	private static int num = 0;
	private int id;

/*  protected int id;
	protected static int num = 0;
	protected String nome;
	protected int idade; */
	
	public Utilizador(String nome, int idade, int id) {
		num++;
		id = num;
		this.nome = nome;
		this.idade = idade;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
/*	 @Override
	    public String toString() {
	        return getClass().getSimpleName() + " {" +
	                "id=" + id +
	                ", nome='" + nome + '\'' +
	                ", idade=" + idade +
	                '}';
	*/
	
}
