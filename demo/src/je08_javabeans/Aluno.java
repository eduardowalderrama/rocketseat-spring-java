package je08_javabeans;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        if (newIdade < 0 || newIdade > 150)
            throw new IllegalArgumentException("O valor da idade estar entre 1 e 150");
        this.idade = newIdade;
    }
}
