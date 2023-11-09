package BiFunction;

public class Cliente {
    public String nombre;
    public int edad;
    public String categoria;

    public Cliente(String nombre, int edad, String categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getCategoria() {return categoria;}

    public void setCategoria(String categoria) {this.categoria = categoria;}
}
