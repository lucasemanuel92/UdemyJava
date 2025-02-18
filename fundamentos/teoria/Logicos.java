package fundamentos.teoria;

import java.sql.SQLOutput;

public class Logicos {
    public static void main(String[] args) {

        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        // "&&" usa o termo E
        System.out.println(cond1 && cond2);
        // "||" usa o termo OU
        System.out.println(cond1 || cond2);
        // "^" usa o OU EXCLUSIVO
        System.out.println(cond1 ^ cond2);
        // "!" altera a condição
        System.out.println(!cond1);




    }
}
