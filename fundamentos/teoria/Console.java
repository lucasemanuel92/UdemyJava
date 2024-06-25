package fundamentos.teoria;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.println(" dia!\n"); // \nn é usado para quebrar a linha quando impresso no terminal

        System.out.printf("Mega sena %d %d \n", 1, 2); // os caracteres especiais é substituido pelos valores dados depois
        System.out.printf("Salario: %.1f \n", 123.456);

        Scanner entrada = new Scanner(System.in); // criar um scanner
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // precisa ser um nextInt porque nextLine mostra a próxima String
                                        // existem vários "nextAlgumaCoisa" para poder ser chamado

        System.out.printf("\nNome: %s \nIdade: %d", nome, idade);

        entrada.close();



    }
}
