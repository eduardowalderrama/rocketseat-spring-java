package je06_operadores;

import java.util.Scanner;

public class Logicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 == 2 || numero2++ == 2) {
            System.out.println("As 2 condicoes sao verdadeiras");
        }

        System.out.println("O numero 1 agora eh " + numero1);
        System.out.println("O numero 2 agora eh " + numero2);
    }
}
