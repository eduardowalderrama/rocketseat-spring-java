package je01_sintaxe_semantica;

public class Conta {
    //variavel da classe conta
    double saldo=10.0;

    public void sacar(Double valor) {
    //variavel do metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o metodo sacar conhece esta variavel
        //System.out.println(novoSaldo);
    }

}
