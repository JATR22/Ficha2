package ficha3;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {
		
	private String titular;
	private double saldo = 0.0;
	private Date dataAbertura;
	
	
	// Construtor de inst�ncia da classe que recebe por par�metro o nome do titular,
	// e cria uma conta banc�ria para o mesmo... Na data de hoje, com o saldo 0 (zero).
	
	public ContaBancaria (String titular) {
		
		this.titular = titular;
		saldo = 0.0;
		dataAbertura =  new Date();
		
	}
	
	// M�todo getInforma��oConta
	public String getInformacaoConta() {
		
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		DecimalFormat decF = new DecimalFormat("0.00");
		
		return "Titular: " + titular + "| Saldo: �" + decF.format(saldo) +
				"| Data Abertura: " + df.format(dataAbertura);
	}
	
	
	
	// M�todo depositar
	public void depositar(double aValor) {
		
		saldo = saldo + aValor;				// 'saldo += aValor' or 'saldo = saldo + aValor'
	}
	
	
	// M�todo levantar
	public boolean levantar(double aValor ) {
		
		if ((saldo - aValor) >= 0)
		{
			saldo = saldo + aValor;			// 'saldo += aValor' or 'saldo = saldo + aValor'
			return true;
		}
		else return false;
		}
	
	
	// GETTERS & SETTERS
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
