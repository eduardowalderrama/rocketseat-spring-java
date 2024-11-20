package je15_excecoes;

public class EstadoValidateException extends RuntimeException {
    public EstadoValidateException() {
        super("O estado nao foi localizado");
    }
}
