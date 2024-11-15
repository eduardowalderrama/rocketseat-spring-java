package je09_controle_fluxo.repeticao;

public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++)
            System.out.println(i + "- Carneirinho(s)");

        System.out.println("=========================================");

        String[] alunos = { "PHILIP", "JONAH", "JULIA", "MARK" };

        for (String aluno : alunos)
            System.out.println(aluno);

    }
}
