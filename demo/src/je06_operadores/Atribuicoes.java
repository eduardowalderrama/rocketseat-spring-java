package je06_operadores;

import java.util.Scanner;

public class Atribuicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean bol = (a + b) > c;
        System.out.println(bol);
    }
}
