package je12_classes_essenciais;

import java.util.Scanner;

public class SystemApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Seu nome eh: " + nome);
        System.out.println("Sua idade eh: " + idade);
    }
}
