package je09_controle_fluxo.condicional;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        double valorSolicitado = scanner.nextDouble();

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso !!");
        } else System.out.println("Saldo insuficiente");

        System.out.println(saldo);
    }
}
