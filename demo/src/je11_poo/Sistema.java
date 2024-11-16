package je11_poo;

import java.math.BigDecimal;

public class Sistema {
    public static void main(String[] args) {
        Cliente walt = new Cliente("Walter Parr");
        System.out.println(walt.limiteCredito);
        walt.solicitarLimiteCredito(BigDecimal.valueOf(200.0));
        walt.comprar(BigDecimal.valueOf(50.0));

        Cliente daphne = new Cliente("Daphne Wheeler");
        System.out.println(daphne.limiteCredito);
        daphne.solicitarLimiteCredito(BigDecimal.valueOf(80.0));
        daphne.comprar(BigDecimal.valueOf(22.00));

        System.out.println("Limite do(a) " + daphne.nome + " R$ " + daphne.limiteCredito);
        System.out.println("Limite do(a) " + walt.nome + " R$ " + walt.limiteCredito);
    }
}
