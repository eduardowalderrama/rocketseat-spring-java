package je12_classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberApp {
    public static void main(String[] args) {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);
        BigDecimal valorPagar = litrosUtilizados.multiply(precoLitro);
        System.out.println(valorPagar); // 126.139848

        // arredondando ...
        BigDecimal valorPagarArredondado = valorPagar.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(valorPagarArredondado); // 126.14
    }
}