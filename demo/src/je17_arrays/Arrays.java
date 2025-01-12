package je17_arrays;

public class Arrays {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 10, 15, 5, 3};
        array[2] = 33;

        System.out.println("el.:" + array[3]);
        for (Integer elemento : array) {
            System.out.println(elemento);
        }
    }
}
