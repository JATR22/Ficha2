package projetoExtra.Utilizador;

import java.util.ArrayList;
import java.util.List;

import projetoExtra.Aplicacao;
import projetoExtra.Compra;

public class Cliente extends Utilizador 
{
	private List<Compra> compras;
	
	
	public Cliente(String nome, int idade, int id, List<Compra> compras) 
	{
		super(nome, idade, id);
		this.compras = new ArrayList<>();
	}

	public void adicionarCompra (Compra compra)
	{
		compras.add(compra);
	}
	
	public List<Aplicacao> getAplicacoesCompradas() 
	{
		List<Aplicacao>compradas = new ArrayList<>();
		for (Compra compra: compras) 
		{
			compradas.addAll(compra.getAplicacoes());
		}
		return compradas;
	}
	
	public List<Compra> getCompras() 
	{
		return compras;
	}
	
}
