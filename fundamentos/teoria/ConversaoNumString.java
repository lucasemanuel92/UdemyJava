package fundamentos.teoria;

public class ConversaoNumString {
    public static void main(String[] args) {

        // O uso do .toString() me permite usar as funcionalidades do tipo String
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        // Posso converter direto na saída
        int num2 = 10000;
        System.out.println(Integer.toString(num2));

        // Não é uma boa idéia fazer assim, mas funciona
        System.out.println(("" + num2).length());

    }
}
