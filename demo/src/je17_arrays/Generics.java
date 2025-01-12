package je17_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> prateleira = new ArrayList<>();
        prateleira.add("Jeep");
        prateleira.add("Ford Ka");
        prateleira.add("Gol 2000");
        prateleira.add("Fiesta");

        Collections.sort(prateleira);
        Collections.reverse(prateleira);
        Collections.shuffle(prateleira);

        for (String carrinho : prateleira) {
            System.out.println(carrinho);
        }
    }
}
