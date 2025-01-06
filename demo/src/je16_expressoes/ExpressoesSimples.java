package je16_expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Matthew Winslow";
        Integer matricula = 123;
        Double salario = 2245.83;

        String dadosFuncionario = String.format("Mat.: %d - Nome: %s - Sal.: %,.2f",
                matricula, nome, salario);

        System.out.println(dadosFuncionario);
    }
}
