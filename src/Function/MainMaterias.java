package Function;
import java.util.function.Function;
public class MainMaterias {
        public static void main(String[] args) {
            Materias materias = new Materias("ingles","ecuaciones","programacion");
            Function<Materias,String>Itinerario = e -> "El itinerario de la universidad es : " + e.getMateria1() + " " + e.getMateria2() + " " + e.getMateria3();
            System.out.println(Itinerario.apply(materias));
        }
}
