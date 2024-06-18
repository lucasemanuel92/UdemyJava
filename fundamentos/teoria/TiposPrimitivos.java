/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJET0: Usar tipos primitivos para armazenar informa��es de um funcion�rio
 */
package fundamentos.teoria;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// TIPOS NUM�RICOS INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 3456;
		int id = 54789;
		long pontosAcumulados = 3_234_567_890L; // pode usar o "_" para facilitar a leiturda e usar um "L" ou "l"
		
		// TIPOS NUM�RICOS REAIS
		float salario = 11_455.44F; // Usar o "F" ou "f" no fim
		double vendasAcumuladas = 2_991_797_103.01;
		
		// TIPO BOOLEANO
		boolean estaDeFerias = false; // ou "true" para verdadeiro
		
		// TIPO CARACTERE
		char status = 'a';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�meros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha " + salario);
		System.out.println("F�rias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
