package je11_poo.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branca","fiat","palio");
        Carro carro2 = new Carro("branca","fiat","palio");
        Carro carro3 = new Carro("branca","fiat","palio");
        Carro carro4 = new Carro("branca","fiat","palio");
        Carro carro5 = new Carro("branca","fiat","uno");

        Carro carro6 = carro1;

        //case01
        System.out.println(carro1 == carro6); //true
        //case02
        System.out.println(carro1.equals(carro2)); //true
        //case03
        System.out.println(carro3.equals(carro4)); // true
        //case04
        System.out.println(carro4.equals(carro5)); // false

    }
}
