package je05_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble; // conversao explicita
        System.out.println(numeroInt);

        // conversao de tipos implicita
        double d = 100.0;
        int i = (int) d;
        System.out.println(i); // 100

        Double a = 100.5656;
        Integer b = a.intValue();
        System.out.println(b); // 100

        double c = 3.75;
        int e = (int) c;
        System.out.println(e);

        String num = "100.123";
        double f = Double.parseDouble(num);
        System.out.println(f); // 100

        Integer obj = Integer.valueOf("100");
        int g = obj.intValue();
        System.out.println(g);

        Integer obj1 = Integer.valueOf("102");
        Integer obj2 = Integer.valueOf("101");

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1 > obj2); // 0

        int anoFabricacao = 2021;
        // reatribuir
        System.out.println(anoFabricacao);

        anoFabricacao = 2022;
        System.out.println(anoFabricacao);
    }
}
