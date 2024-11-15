package je11_poo.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        for (EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println("ESTADO LOCALIZADO");
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
        }

    }
}
