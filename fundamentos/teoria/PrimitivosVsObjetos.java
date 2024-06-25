package fundamentos.teoria;

public class PrimitivosVsObjetos {
    public static void main(String[] args) {

        String s = new String("Texto teste"); // forma não usual de criar uma string
        s.toUpperCase();

        int a = 123; // não existe comportamentos relacionados aos tipos primitivos como ".toUpperCase()";

        System.out.println(s);
        System.out.println(a);
    }
}
