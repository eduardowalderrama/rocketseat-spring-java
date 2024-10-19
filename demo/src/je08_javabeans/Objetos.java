package je08_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno philip = new Aluno();
        philip.setNome("Philip");
        philip.setIdade(8);

        System.out.println("O aluno " + philip.getNome() + " tem " + philip.getIdade());
    }
}
