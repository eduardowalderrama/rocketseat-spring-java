package je06_operadores;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Delilah";
        int idade = scanner.nextInt();
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;

        String mensagem = nome + (maiorIdade ? " eh de maior " : " nao eh de maior");
        System.out.println(mensagem);
    }
}
