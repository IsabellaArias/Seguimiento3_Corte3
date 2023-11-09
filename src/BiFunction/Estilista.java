package BiFunction;

public class Estilista {
    public String nombre;
    public Integer rango;

    public Float pago;

    public Estilista(String nombre, Integer rango) {
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Integer getRango() {return rango;}

    public void setRango(Integer rango) {this.rango = rango;}

    public Float getPago() {return pago;}

    public void setPago(Float pago) {this.pago = pago;}

}
