/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Estudo sobre inferencia de vari�veis.
 */

package fundamentos.teoria;

public class inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // O Java infere qual � o tipo 
		System.out.println(b);
		
		var c = "Texto"; // Inferindo ser uma STRING
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5 N�O funciona porque a infer�ncia � de um �nico tipo. N�o posso mudar de double para string
		
		double d; // declarei
		d = 123.45; // inicializei
		System.out.println(d); // usei
	}

}
