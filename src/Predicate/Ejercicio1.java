package Predicate;

import java.util.function.Predicate;

public class Ejercicio1 {
    public static void main(String[] args) {
        Predicate<String> t1 = gastronomia -> gastronomia.equals("food");
        System.out.println(t1.test("food"));
    }
}
