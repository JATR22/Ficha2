package ficha3;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static String nome;
	private static List<ContaBancaria> contasBancarias;
	private List<Casa> casas;	// Atributo 'Lista de Casas' Ex 4. 
	

// Construtor do Banco, que recebe o nome e inicializa o Array para cem itens. 
	public Banco(String nome) {
		
		Banco.nome = nome;
		contasBancarias = new ArrayList<ContaBancaria>(100);
//		casas = new ArrayList<Casa>();
	}
	
// M�todo criaConta que recebe uma conta banc�ria por par�metro e acrescenta-a ao Array.	
	public static void criaConta (ContaBancaria conta)
	{
		contasBancarias.add(conta);
	}
	
// M�todo getConta que recebe o titular por par�metro e devolve a conta desse titular.
	public static ContaBancaria getConta (String titular)
	{
		for (ContaBancaria conta : contasBancarias)
		{
			if (conta.getTitular().equals(titular))
			{
				return conta;
			}
		}
		return null;
	}
	
	
	public List<ContaBancaria> getContas ()
	{
		return contasBancarias;
	}
	
	
	public void setContas (List<ContaBancaria> contas)
	{
		Banco.contasBancarias = contas;
	}
	

	// Retorna o nome do banco...
	public static String getNome() {
		return nome;
	}
	
	
	// Fun��o para adicionar uma nova casa, � lista de casas do banco.	Ex. 4
	public void addCasa (Casa casa)
	{
		casas.add(casa);
	}
	

	// Fun��o que recebe a morada de uma casa / Retorna a casa pela morada
	// Ex. 4
	
	public Casa getCasaByMorada (String morada)
	{
		for (Casa casa : casas)
		{
			if (casa.getMorada().equals(morada))
			{
				return casa;
			}
		}
		return null;
	}
	

	// Fun��o que remove a casa, atrav�s da morada, da lista de casas do Banco
	// Ex. 4
	
	public boolean remCasaByMorada (String morada)
	{
		if (getCasaByMorada(morada)!= null)
		{
			casas.remove(casas.indexOf(getCasaByMorada(morada)));
			return true;
		}
		return false;
	}
	
}
