package projetoExtra;

import java.util.Date;
import java.util.List;

import projetoExtra.Utilizador.Cliente;

public class Compra 
{
	private Date date;
	private double preco;
	private List <Aplicacao> aplicacoes;
	private Cliente cliente;
	
	public Compra(Cliente cliente, List<Aplicacao> aplicacoes) 
	{
		this.date = new Date();
		this.preco = aplicacoes.stream().mapToDouble(Aplicacao::getPreco).sum();
		aplicacoes.forEach(Aplicacao::adicionarVenda);
		this.aplicacoes = aplicacoes;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Compra {date=" + date + ", preco=" + preco + ", aplicacoes=" + aplicacoes + ", cliente=" + cliente
				+ "}"; 
	} 

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	

}
