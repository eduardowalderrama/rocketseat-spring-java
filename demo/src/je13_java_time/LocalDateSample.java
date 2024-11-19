package je13_java_time;

import java.time.LocalDate;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2021, 8, 23);

        System.out.println(data.getDayOfMonth());   // retorna o dia do mes -> 23
        System.out.println(data.getYear());         // retorna o ano -> 2021
        System.out.println(data.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(data.getMonthValue());   // retorna o numero do mes entre 1-12 -> 8
    }
}
