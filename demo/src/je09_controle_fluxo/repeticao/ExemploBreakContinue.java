package je09_controle_fluxo.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3)
                continue;

            System.out.println("execucao apos a regra");
        }

    }
}
