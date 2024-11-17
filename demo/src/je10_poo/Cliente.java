package je11_poo;

import java.math.BigDecimal;

public class Cliente {
    String nome;
    BigDecimal limiteCredito = BigDecimal.valueOf(100.0);

    public void solicitarLimiteCredito(BigDecimal valorSolicitado) {
        limiteCredito = valorSolicitado;
    }

    public void comprar(BigDecimal valorProduto) {
        limiteCredito = limiteCredito.subtract(valorProduto);
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
}
