package fundamentos.desafios;
/* Criar uma calculadora usando o Scanner dando a média dos últimos 3 salários,
 * o programa deve ser capaz de entender "," ou "." para realizar as contas
 */

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        // Criando o Scanner
        Scanner entrada = new Scanner(System.in); // Criando a entrada do scanner
        double salario, mediaSalarial = 0; // Iniciando as variáveis

        // for(início da condição, condição, o que fazer)
        for(int i = 0; i < 3; i++) {
            System.out.print("Digite salario: "); // Exibir mensagem
            String salarioStr = entrada.nextLine(); // Ir para próxima linha
            salarioStr = salarioStr.replace(",", "."); // Mudar "," para "." e fazer a conta corretamente
            salario = Double.parseDouble(salarioStr); // Converter para double
            mediaSalarial += salario; // Somar os salários

        }

        double media = mediaSalarial / 3; // Criar a média
        System.out.printf("A media salarial e %.2f reais", media);

        entrada.close();
    }
}
