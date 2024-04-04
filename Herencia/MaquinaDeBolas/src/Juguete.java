public class Juguete {

    private String nombre;
    private double precio;

    public Juguete() {
        this.nombre = "";
        this.precio = 0.20;
    }

    public Juguete(String nombre, double precio) {
        this();
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

    }

}
