/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Estudo sobre inferencia de variáveis.
 */

package fundamentos;

public class inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // O Java infere qual é o tipo 
		System.out.println(b);
		
		var c = "Texto"; // Inferindo ser uma STRING
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5 NÃO funciona porque a inferência é de um único tipo. Não posso mudar de double para string
		
		double d; // declarei
		d = 123.45; // inicializei
		System.out.println(d); // usei
	}

}
