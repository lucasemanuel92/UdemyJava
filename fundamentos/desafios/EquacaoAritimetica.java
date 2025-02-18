package fundamentos.desafios;

public class EquacaoAritimetica {
    public static void main(String[] args) {
        // Foi dada uma equação para ser refeita, tá bem ruim, mas funciona

        double a = 6 * (3 + 2);
        double b = 3 * 2;
        double c = Math.pow(a, 2) / b;

        double d = (double) ((1 - 5) * (2 - 7)) / 2;
        double e = Math.pow(d, 2);

        double f = c - e;
        double g = Math.pow(f, 3);

        double h = Math.pow(10, 3);

        double results = g / h;
        System.out.println(results);


    }
}
