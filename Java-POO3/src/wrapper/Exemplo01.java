package wrapper;

public class Exemplo01 {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 10;

        // int newInt = integer.intValue();
        int newInt = integer;

        int numero = Integer.parseInt("1234");

        System.out.println(n);
        System.out.println(integer);
        System.out.println(newInt);
        System.out.println(numero);
    }
}
