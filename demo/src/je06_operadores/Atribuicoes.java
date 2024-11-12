package je06_operadores;

public class Atribuicoes {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        System.out.println(nomeCompleto);
        System.out.println(concatenacao);
    }
}
