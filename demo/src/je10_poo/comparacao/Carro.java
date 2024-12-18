package je11_poo.comparacao;

import java.util.Objects;

public class Carro {
    String cor;
    String marca;
    String modelo;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(cor, carro.cor) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, modelo);
    }
}
