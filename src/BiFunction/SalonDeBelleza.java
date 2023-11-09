package BiFunction;

import java.util.function.BiFunction;

public class SalonDeBelleza {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("Aurora",27,"premium");
        Estilista estilista= new Estilista("Doris",10);

        BiFunction<Cliente,Estilista,String> salon=(c,e)->{
            e.setPago(50.000F);
            return e.getNombre() + " ha cobrado " + e.getPago() + " a " + c.getNombre() + " cliente " + c.getCategoria();
        };
        System.out.println((salon.apply(cliente,estilista)));
    }
}
