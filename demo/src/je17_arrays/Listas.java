package je17_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Object> linguagens = new ArrayList<>();
        linguagens.add("java");
        linguagens.add("c#");
        linguagens.add("javascript");
        linguagens.add("go");
        linguagens.remove("go");
        linguagens.add(3, "python");

        System.out.println(linguagens.contains("python"));

        for (Object linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
