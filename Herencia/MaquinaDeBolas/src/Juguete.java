import java.util.Random;

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

    public static double generarPrecioJuguete() {
        double precioMinimo = 0.20;
        double precioMaximo = 2.00;
        Random rand = new Random();

        double precioGenerado = precioMinimo + (precioMaximo - precioMinimo)
                * rand.nextDouble();
        return precioGenerado;

    }

    @Override
    public String toString() {
        return this.nombre + " -> " + this.precio + '€';

    }

    public static void main(String[] args) {

        System.out.println("El precio generado es: " + String.format("%.2f",
                generarPrecioJuguete()));

    }

}
