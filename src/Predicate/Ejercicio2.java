package Predicate;

import java.util.function.Predicate;

public class Ejercicio2 {
    public static void main(String[] args) {
        Predicate<Integer> t1 = number -> number == 1;
        boolean t2 = t1.test(2);
        System.out.println("1 equals 2? " + t2);
    }
}
