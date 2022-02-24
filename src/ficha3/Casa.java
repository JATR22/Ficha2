package ficha3;

public class Casa {

	private String morada; 
	private double precoCusto;
	private double precoVenda; 
	
	// Construtor da instância da classe...
	public Casa() {
		super();
	}
	
	// Construtor que recebe a morada da casa e cria a casa, com a mesma morada...
	public Casa(String morada) {
		super();
		this.morada = morada;
	}

	// Método getLucro (Diferença entre o preço de venda e o preço de custo)
	public double getLucro ()
	{
		return precoVenda - precoCusto;
	}
	
	// Método getPercentMargemLucro (Razão entre o preço de venda e o preço de custo)
	 public double getPercentMargemLucro()
	 {
		 return precoVenda / precoCusto;	 
	 }
	 
	 public String toString ()
	 {
		 return "Morada: " + morada + " | Preço de custo: " + precoCusto + " | Preço de venda: " + precoVenda + " | Lucro: " + getLucro() + " | % margem de lucro: " + getPercentMargemLucro();
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
