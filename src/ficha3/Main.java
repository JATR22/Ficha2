package ficha3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza o nome do titular:");
		 
		ContaBancaria contaBancaria = new ContaBancaria(sc.nextLine());
		 
		System.out.println("Conta \"" + contaBancaria.getTitular() +
		 "\"criada com sucesso.");
		  
		System.out.println(contaBancaria.getInformacaoConta());
	}
	
}
