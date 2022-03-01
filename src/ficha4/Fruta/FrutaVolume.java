package ficha4.Fruta;


public class FrutaVolume extends Fruta implements Descontavel {

	
	double percentagemDesconto;
	
	
	private double volume;
	
	
	public FrutaVolume(String nome, double precoBase, double volume) {
		super(nome, precoBase);
		this.volume = volume;
		this.percentagemDesconto= 0;
	}

	
	@Override
	public double pagar() {
		return volume * precoBase - descontar();
	}
	
	
	@Override
	public double descontar() {
		return volume * precoBase * percentagemDesconto / 100;
	}
	
	
	public double getPercentagemDesconto() {
		return percentagemDesconto;
	}

	
	public void setPercentagemDesconto(double percentagem) {
		this.percentagemDesconto = percentagem;
	}

}
