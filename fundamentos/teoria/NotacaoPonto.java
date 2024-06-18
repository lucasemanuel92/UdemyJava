package fundamentos.teoria;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.toUpperCase(); // Determinar uma "nova" variável captando a antiga e usando função

        s = s.replace("X", "Senhora"); //Nesse caso o "Senhora" não ficará maiusculo porque veio depois
        s = s.concat("!!");

        System.out.println(s);
        System.out.println("Lucas".toUpperCase());

        String x = "Bom dia x".replace("x", "Lucas");
        System.out.println(x);

        // É uma boa ideia quebrar a linha usando o ponto
        String w = "Oi Lucas, bom dia"
                .toUpperCase()
                .replace("Oi","Olá");
        System.out.println(w);

        // Tipos primitivos não tem o operador ".QualquerCoisa"
    }
}
