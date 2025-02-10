package fundamentos.teoria;

import javax.swing.*;

public class ConversaoStringNum {
    public static void main(String[] args) {

        // JOptionPane abre uma janela
        // showInputDialog introduz uma mensaggem na janela
        // Nesse caso ele vai criar duas strings
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

        // Sem tratamento de dados ele só concatena
        System.out.println(valor1 + valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        System.out.println(num1 + num2);


        double soma = (num1 + num2)/2;
        System.out.println(soma);
    }
}
