package ficha3;

import java.util.Date;

public class ContaBancaria {
		
	private String titular;
	private double saldo = 0.0;
	private Date dataAbertura;
	
	
			
	public ContaBancaria (String titular) {
		super();
		this.titular = titular;
		
	}
	
	public String getInformacaoConta() {
		
		return this.toString();
		
	}
	
	public void depositar(double aValor) {
		
		saldo = saldo + aValor;				// 'saldo += aValor' or 'saldo = saldo + aValor'
	}
	
	public boolean levantar(double aValor ) {
		
		if ((saldo - aValor) >= 0)
		{
			saldo = saldo + aValor;			// 'saldo += aValor' or 'saldo = saldo + aValor'
			return true;
		}
		else return false;
		}
	
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	
	

}
