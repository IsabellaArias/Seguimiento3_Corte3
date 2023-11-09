package Function;
import java.util.function.Function;

public class Dividir {
    public static void main(String[] args) {
        Function<Integer, Integer> div = x -> x / 2;
        int numero = 88;
        int resultado = div.apply(numero);
        System.out.println("La division de " + numero + " es " + resultado);
    }
}
