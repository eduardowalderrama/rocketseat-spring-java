package je11_poo.comparacao;

public class Comparacao {
    public static void main(String[] args) {
        // stack vs heap
        // stack = referencia [==]
        // heap = caracteristicas de referencias dos objetos [equals]

        Integer i1 = 128;
        Integer i2 = Integer.parseInt("128");

        System.out.println(i1.equals(i2));
    }
}
