package je03_indentacao;

import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mediaFinal = scanner.nextInt();

        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
