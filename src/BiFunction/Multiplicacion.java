package BiFunction;

import java.util.function.BiFunction;

public class Multiplicacion {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiplicar = (o, z) -> o * z;
        int multiplicacion = multiplicar.apply(5, 2);
        System.out.println("La Multiplicación es igual a: " + multiplicacion);
    }
}
