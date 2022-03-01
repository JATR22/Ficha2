package ficha4;

import ficha4.Fruta.Cesto;
import ficha4.Fruta.FrutaPeso;
import ficha4.Fruta.FrutaUnidade;
import ficha4.Fruta.FrutaVolume;

public class Main {

	public static void main(String[] args) {
	

		System.out.println("*** Exercício 1 ***"); 
		FrutaPeso laranja = new FrutaPeso("Laranja", 3.3, 1);
		
		System.out.println("Tem a pagar " + laranja.pagar() + "€");
		
		System.out.println("\n*** Exercício 2 ***"); 
		
		FrutaPeso pera = new FrutaPeso("Pêra", 3.3, 1.1);
		FrutaPeso cereja = new FrutaPeso("Cereja", 3.5, 1.2);
		
		FrutaUnidade morango = new FrutaUnidade ("Morango", 3.50, 1);
		FrutaUnidade kiwi = new FrutaUnidade ("Kiwi", 2.8, 1);
		
		FrutaVolume banana = new FrutaVolume("Banana", 6.3, 2.0);
		
		Cesto cesto = new Cesto();
		
		cesto.addFruta(pera);
		cesto.addFruta(cereja);
		cesto.addFruta(morango);
		cesto.addFruta(kiwi);
		cesto.addFruta(banana);
		
		System.out.println("Cesto criado! Frutas adicionadas ao cesto.");
		
		System.out.println("Relação de número de frutas por tipo: ");
		System.out.println("Fruta/Peso: " + cesto.getNumFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta/Unidade: " + cesto.getNumFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta/Volume: " + cesto.getNumFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\nValor total das frutas por tipo: ");
		System.out.println("Fruta/Peso: " + cesto.getTotalFrutosFromTipo("FrutaPeso"));
		System.out.println("Fruta/Unidade: " + cesto.getTotalFrutosFromTipo("FrutaUnidade"));
		System.out.println("Fruta/Volume: " + cesto.getTotalFrutosFromTipo("FrutaVolume"));
		
		System.out.println("\n*** Exercício 3 ***");
		
		
		pera = new FrutaPeso("Pêra", 3.2, 1);
		
		pera.setPercentagemDesconto(10);
		
		System.out.println(pera.pagar());
		
		banana = new FrutaVolume("Banana", 3.15, 1);
		
		System.out.println("Pago, sem desconto: " + banana.pagar());
		
		banana.setPercentagemDesconto(5);	
		
		System.out.println("Pago, com desconto: " + banana.pagar());
	}

}
