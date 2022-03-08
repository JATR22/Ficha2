package laboratorioProgramming;

public class Ficha_1 {

	public static void main(String[] args) {
		System.out.println("Hello World!");// Display the string.}

		System.out.println(soma (71345, 53453));
		System.out.println(subtracao (42432, 453636));
		System.out.println(mult (7, 7));
		System.out.println(operacaoComplexa (4, 4));

		System.out.println(complex(7, 7));

	}

	public static int soma(int int1, int int2) {
		int soma = int1 + int2;

		return soma;
	}

	public static int subtracao(int int1, int int2) {
		int subtract = int1 - int2;

		return subtract;
	}

	public static int mult(int aNum1, int aNum2) {
		return aNum1 * aNum2;
	}


	public static int operacaoComplexa (int aNum1, int aNum2)
	{
		return soma (mult (aNum1, aNum2), subtracao (aNum1, aNum2));
	}

	public static int complex(int num1, int num2) {
		return mult(num1, num2) * subtracao(num1, num2);
	}
	
	public static int subtracao2(int int1, int int2) {
		int subtract = int1 - int2;

		return subtract;
	}
	
	public static int subtracao3(int int1, int int2) {
		int subtract = int1 - int2;

		return subtract;
		
	}

}

