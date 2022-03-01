package ficha4.Fruta;

public abstract class Fruta {

	protected String nome;
	protected double precoBase;
	

	public Fruta(String nome, double precoBase) {
	super();
	this.nome = nome;
	this.precoBase = precoBase;
	}

	
	abstract double pagar();
	
	
	public String getNome() {
		return nome;
	}

	
	public double getPrecoBase() {
		return precoBase;
	}
	
}
