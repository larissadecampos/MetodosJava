package Aula1.Exercicios;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exerc�cio da calculadora");
		Calculadora.soma(3,6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5,2.5);
		
		// Mensagems
        System.out.println("Exerc�cio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empr�stimo
        System.out.println("Exerc�cio empr�stimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
		
	}
}
