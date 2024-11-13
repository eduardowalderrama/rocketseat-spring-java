package je09_controle_fluxo.condicional;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }

}
