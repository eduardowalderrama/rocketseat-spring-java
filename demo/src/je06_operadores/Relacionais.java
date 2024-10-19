package je06_operadores;

import java.util.Scanner;

public class Relacionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int idadeDelilah = scanner.nextInt();

        boolean maiorIdade = idadeDelilah >= 18;
        System.out.println("Delilah eh maior de idade? " + (maiorIdade ? "Sim" : "Nao"));

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 eh diferente de numero 2");

    }
}
