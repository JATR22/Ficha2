package ficha4.Fruta;


public class FrutaPeso extends Fruta implements Descontavel {

	
	private double peso;
	
	
	double percentagemDesconto;

	
	public FrutaPeso(String nome, double precoBase, double peso) {
		super(nome, precoBase);
		this.peso = peso;
		this.percentagemDesconto= 0;
	}

	
	@Override
	public double pagar() {
		return peso * precoBase - descontar();
	}
	
	
	@Override
	public double descontar() {
		return peso * precoBase * percentagemDesconto / 100 ; 
	}

	
	
	public double getPercentagemDesconto() {
		return percentagemDesconto;
	}

	
	public void setPercentagemDesconto(double percentagem) {
		this.percentagemDesconto = percentagem;
	}
	
}