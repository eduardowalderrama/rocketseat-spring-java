package je08_javabeans;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 150)
            throw new IllegalArgumentException("O valor da idade deve estar entre 1 e 150");

        this.idade = idade;
    }
}
