package je13_java_time;

import java.time.LocalTime;

public class JavaTimeSample {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(13, 21, 42);

        System.out.println(hora.getHour());     // 13
        System.out.println(hora.getMinute());   // 21
        System.out.println(hora.getSecond());   // 42
        System.out.println(hora.getNano());     // 0
    }
}
