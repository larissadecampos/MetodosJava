package Aula1.Exercicios;

/*
 * Crie uma aplica��o que resolva as seguintes situa��es: Calcule as 4 opera��es
 * b�sicas: soma, subtra��o, multiplica��o e divis�o. Sempre 2 valores devem ser
 * passados. 
 */

public class Calculadora {

//	visibilidade tipo retorno nome do m�todo e seus par�metros
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("A soma de " + numero1 + "+" + numero2 + "=" + resultado);

	}
	
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1-numero2;
		System.out.println("A subtra��o de " + numero1 + "-" + numero2 + "=" + resultado);

	}

	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1*numero2;
		System.out.println("A multiplica��o de " + numero1 + "x" + numero2 + "=" + resultado);

	}
	
	public static void divisao(double numero1, double numero2) {
		double resultado = numero1/numero2;
		System.out.println("A divis�o de " + numero1 + " por " + numero2 + "=" + resultado);

	}
}
