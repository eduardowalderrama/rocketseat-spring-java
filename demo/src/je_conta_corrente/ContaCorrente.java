package je_conta_corrente;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double consultarSaldo () {
        return saldo;
    }

    List<?> consultarExtrato (LocalDate dataInicial, LocalDate dataFinal) {
        return null;
    }

    void cancelar (String justificativa) {
        // algoritimo ira manipular o atributo
        // ativo para que se torne false
    }

    void transferir (ContaCorrente contaDestino,
                     Double valorTransferido) {

    }

    void sacar (Double valorSolicitado) {
        // nao solicitei logica
    }

}
