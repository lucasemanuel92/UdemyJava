package fundamentos.teoria;

public class ConversaoTipos {
    public static void main(String[] args) {

        // Inter to Double
        double a = 1; // Conversão implícita, não tem perda de informação
        System.out.println(a);

        // (CAST) pode haver perda de informação nesse caso Double para Float
        float b = (float) 1.0; // Conversão Explícita, usando (tipo) ou pode só usar F depois do numero
        System.out.println(b);

        int c = 130; // Tipo maior que byte
        byte d = (byte) c;
        System.out.println(d);

    }
}
