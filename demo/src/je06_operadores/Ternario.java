package je06_operadores;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
                resultado = "verdadeiro";
            else
             resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNARIO
        String resultado = (a==b) ? "true" : "false";
        System.out.println(resultado);
    }
}
