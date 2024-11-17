package je12_pilares_poo;

public class SistemaMensagemInstantanea {
    public void enviarMensagem() {
        if (validarConectadoInternet())
            System.out.println("Enviando mensagem");
        else
            System.out.println("Computador offline");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private boolean validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
        return false;
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
