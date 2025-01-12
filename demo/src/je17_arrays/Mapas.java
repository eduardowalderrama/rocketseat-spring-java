package je17_arrays;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();
        estados.put("PI", "Piaui");
        estados.put("MA", "Maranhao");
        estados.put("CE", "Ceara");

        System.out.println("O estado que esta na chave MA eh " + estados.get("MA"));

        for (String chave : estados.keySet()) {
            String valor = estados.get(chave);

            System.out.println("O estado eh " + valor);
        }
    }
}
