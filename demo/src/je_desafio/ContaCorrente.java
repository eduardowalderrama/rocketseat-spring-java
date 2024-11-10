package je_desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double consultarSaldo() {
        return saldo;
    }

    List<?> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        return new ArrayList<>();
    }

    void cancelar(String justificativa) {
        // algoritimo ira manipular o atributo
        // ativo para que se torne false
    }

    void transferir(ContaCorrente contaDestino, Double valorTransferido) {

    }

    void sacar(Double valorSolicitado) {

    }
}
