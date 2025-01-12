package je17_arrays;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<Object> linguagens = new HashSet<>();
        linguagens.add("java");
        linguagens.add("c#");
        linguagens.add("javascript");
        linguagens.add("go");
        linguagens.remove("go");
        linguagens.add("java");

        System.out.println(linguagens.contains("python"));

        for (Object linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
