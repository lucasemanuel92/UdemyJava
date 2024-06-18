/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Criar um programa que calcule uma transforma��o de temperatura de Celsius para Farenheit
 */
package fundamentos.desafios;


public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final double fator = 5/9.0;
		final double ajuste = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("O resultado � " + celsius + "C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println("O resultado � " + celsius + "�C.");
		
	}

}
