package je15_excecoes;

public class Excecoes {
    public static void main(String[] args) {
        try {
            checkEstado("FL");
        } catch (EstadoValidateException e) {
            System.out.println(e.getMessage());
            System.out.println("Selecione um estado valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Selecione um estado brasileiro");
        }
    }

    static void checkEstado(String nomeEstado) throws EstadoValidateException, Exception {
        if (!nomeEstado.equalsIgnoreCase("FL"))
            throw new Exception("Este estado nao consta no Brasil");
        if (!nomeEstado.equalsIgnoreCase("PI"))
            throw new EstadoValidateException();
        System.out.println("Bem-vindo ao (a): " + nomeEstado.toUpperCase());
    }
}
