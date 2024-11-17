package je11_poo.enums;

public enum EstadoBrasileiro {
    PI ("Piaui", "PI"),
    MA ("Maranhao", "MA"),
    SP ("Sao Paulo", "SP"),
    RJ ("Rio de Janeiro", "RJ"),
    CE ("Ceara", "CE");

    private final String nome;
    private final String sigla;

    EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
