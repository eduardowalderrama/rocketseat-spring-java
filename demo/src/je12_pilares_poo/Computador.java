package je12_pilares_poo;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
            NAO SE SABE QUAL APP
            MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
