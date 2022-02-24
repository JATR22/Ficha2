package ficha3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// Teste Classe Casa - Três casas criadas.		Exercício 3 da Ficha 3
		Casa casa1 = new Casa("Santa Cruz");
		Casa casa2 = new Casa("Funchal");
		Casa casa3 = new Casa("Porto Moniz");

		casa1.setPrecoCusto(2000);
		casa2.setPrecoCusto(5000);
		casa3.setPrecoCusto(4000);

		casa1.setPrecoVenda(2600);
		casa2.setPrecoVenda(5700);
		casa3.setPrecoVenda(4500);

		System.out.println(casa1);
		System.out.println(casa2);
		System.out.println(casa3);
		
		
		// Teste Classe ContaBancaria / Banco			Exercícios 1 e 2 da Ficha 3
		// . Criação de Conta / Depósitos e Levantamentos + Atualização do Saldo (Ecrã 'Consola')
		
		Banco banco = new Banco("Novo Banco"); 
		  
		System.out.println("\nNovo Banco criado com sucesso. Crie a sua primeira conta!\n");
		  
		
		System.out.println("Introduza o nome do titular:");
		 
		ContaBancaria contaBancaria = new ContaBancaria(sc.nextLine());
		 
		System.out.println("Conta \"" + contaBancaria.getTitular() +
		 "\"criada com sucesso.");
		  
		System.out.println(contaBancaria.getInformacaoConta());
		
		
		
		Banco.criaConta(contaBancaria);
		System.out.println("Conta adicionada ao banco com sucesso.");
		 
		
		int opcao = 0;
		 
		boolean ok = true; do { System.out.println("\nBem-vindo ao " +
								Banco.getNome());
		  
		System.out.println("\nIntroduza o nome do titular da conta que deseja movimentar.");
		  
		String titular = sc.nextLine(); System.out.println("\nMovimentando a conta: " + titular); 
		
		System.out.println(Banco.getConta(titular).getInformacaoConta());
		
		System.out.println("\nPrima 1 para depositar, 2 para levantar, ou 3 para sair:");
		  
		  
		opcao = sc.nextInt();
		  
			if (opcao == 1) 
		
				{ System.out.println("Introduza o valor a depositar:");
		  
				Banco.getConta(titular).depositar(sc.nextDouble()); sc.nextLine(); } 
		
			else if (opcao == 2) 
		
				{ System.out.println("Introduza o valor a levantar:");
		  
			if (Banco.getConta(titular).levantar(sc.nextDouble()) != true) {
		  
				System.out.println("Saldo insuficiente."); } sc.nextLine(); } 
		  
			else if (opcao== 3) { ok = false; break; }
		  
				System.out.println(Banco.getConta(titular).getInformacaoConta()); } 
		
			while (ok);
		 
		sc.close();
		
	}
	
}
