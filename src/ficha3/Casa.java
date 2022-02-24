package ficha3;

public class Casa {

	private String morada; 
	private double precoCusto;
	private double precoVenda; 
	
	// Construtor da inst�ncia da classe...
	public Casa() {
		super();
	}
	
	// Construtor que recebe a morada da casa e cria a casa, com a mesma morada...
	public Casa(String morada) {
		super();
		this.morada = morada;
	}

	// M�todo getLucro (Diferen�a entre o pre�o de venda e o pre�o de custo)
	public double getLucro ()
	{
		return precoVenda - precoCusto;
	}
	
	// M�todo getPercentMargemLucro (Raz�o entre o pre�o de venda e o pre�o de custo)
	 public double getPercentMargemLucro()
	 {
		 return precoVenda / precoCusto;	 
	 }
	 
	 public String toString ()
	 {
		 return "Morada: " + morada + " | Pre�o de custo: " + precoCusto + " | Pre�o de venda: " + precoVenda + " | Lucro: " + getLucro() + " | % margem de lucro: " + getPercentMargemLucro();
	 }
	
	// GETTERS & SETTERS
	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}


	public double getPrecoCusto() {
		return precoCusto;
	}


	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}


	public double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
		
	
}
