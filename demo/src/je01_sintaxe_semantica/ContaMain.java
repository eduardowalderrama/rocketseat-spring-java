package je01_sintaxe_semantica;

public class ContaMain {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.sacar(10.00);
        conta.imprimirSaldo();
    }
}
