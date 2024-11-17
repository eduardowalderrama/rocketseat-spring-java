package je12_pilares_poo;

public class Computador {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
