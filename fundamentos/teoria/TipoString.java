package fundamentos.teoria;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        // Ao usar qualquer método usado s = s.QualquerCoisa, eu estou substituindo o valor e não alterando.
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); // Tipo booleano, idicando verdadeiro ou falso
        System.out.println(s.length()); // Pode indicar um valor
        System.out.println(s.equals("boa tarde")); // Compara valores e pode se combinado como  equalsIgnoreCase e outras

        String nome = "Pedro";
        String sobrenome = "Santos";
        String nomeCompleto = nome.concat(" " + sobrenome);
        System.out.println(nomeCompleto);

        System.out.printf("Nome: %s %s", nome, sobrenome); // %s ou %d... é usado como formatação para não precisar colocar tudo na frase
    }
}
