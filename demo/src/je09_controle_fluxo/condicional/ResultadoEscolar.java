package je09_controle_fluxo.condicional;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5)
            fluxoIntermediario();
        else
            System.out.println("Reprovado");
    }

    static void fluxoIntermediario() {
        // faria alguma coisa
        System.out.println("Recuperacao");
        System.out.println("Estude um pouco mais");
    }
}
