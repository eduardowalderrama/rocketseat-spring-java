package je07_documentacao;
/**
 * Calculadora Simples
 * @author Eduardo Walderrama
 */
public class Calculadora {
    /**
     * Realiza a divisao entre dois numeros inteiros
     *
     * @param dividendo     Numero que sera dividido
     * @param divisor       Numero que ira dividir o dividendo
     * @return              O resultado da divisao entre o dividendo e o divisor
     * @author              Eduardo Walderrama
     * @exception           java.lang.ArithmeticException em casa de passar o divisor igual a zero 0.
     */
    Integer dividir (Integer dividendo, Integer divisor) {
        return dividendo / divisor;
    }
}
