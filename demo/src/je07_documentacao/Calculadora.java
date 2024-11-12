package je07_documentacao;

/**
 * Calculadora Simples
 * @author walderrama
 * @since v1.0
 */
public class Calculadora {
    /**
     * Realiza a divisao entre dois numeros inteiros
     *
     * @param dividendo     Numero que sera dividido
     * @param divisor       Numero que ira dividir o dividendo
     * @return              O resultado da divisao entre o dividendo e o divisor
     * @author              walderrama
     * @exception           java.lang.ArithmeticException em caso de passar o divisor igual a zero
     */
    static Double dividir(Double dividendo, Double divisor) {
        return dividendo / divisor;
    }
}
