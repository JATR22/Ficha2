package ficha3;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {
		
	private String titular;
	private double saldo = 0.0;
	private Date dataAbertura;
	
	
			
	public ContaBancaria (String titular) {
		super();
		this.titular = titular;
		saldo = 0.0;
		dataAbertura =  new Date();
		
	}
	
	public String getInformacaoConta() {
		
		return this.toString();
		
	}
	
	public String toString ()
	{
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		DecimalFormat decF = new DecimalFormat("0.00");
		Date date = new Date();
		
		return "Titular: " + titular + "| Saldo: €" + decF.format(saldo) +
				"| Data Abertura: " + df.format(date);
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
