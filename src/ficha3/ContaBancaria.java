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
