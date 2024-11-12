package je08_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno philip = new Aluno();
        philip.setNome("Philip Jr.");
        philip.setIdade(151);
        System.out.println(philip.getNome());
    }
}
