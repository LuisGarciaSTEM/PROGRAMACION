import java.util.Scanner;

public class Circulo {

    // Atributos de la clase, en este caso (circulo).

    private int radio = 5;
    private String color;

    // Métodos de la clase.

    // Constructor() -> Por defecto.
    public Circulo() {
        this.radio = 1;
        this.color = "blanco";
    }

    // Constructor(int radio, String color) -> Con parámetros.
    public Circulo(int radio, String color) {
        this.setRadio(radio);
        this.color = color;
    }

    // Constructor(Circulo c) -> De copia.
    public Circulo(Circulo c) {
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Conseguir la información de los atributos. Y se le pone get+Nombre
    public int getRadio() {
        return this.radio;
    }

    public String getColor() {
        return this.color;
    }

    // Set -> Establecer la informacion a los atributos.
    public void setRadio(int radio) {
        this.radio = radio;
        if (radio < 1) {
            this.radio = 1;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Siempre se tiene que llamar así, porque java asume que cuando queremos
    // mostrar por pantalla un circulo(print), tiene que llamar a toString() y
    // siempre encima del main.
    public String toString() {
        return "El radio es " + this.radio + " el color es: " + this.color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constructor por defecto.
        Circulo circulitoPorDefecto = new Circulo();
        // Constructor por parametros.
        Circulo circuloConParametros = new Circulo(2, "Azul");
        // Constructor de copia.
        Circulo circulitoDeCopia = new Circulo(circuloConParametros);

        // Esto es para imprimirlo, por el toString();
        System.out.println(circulitoPorDefecto);
        System.out.println(circuloConParametros);
        System.out.println(circulitoDeCopia);

        circulitoDeCopia.setColor("Rojo");
        circulitoDeCopia.setRadio(5);

        System.out.println(circulitoDeCopia);

        System.out.println("¿El círculo por defecto tiene el mismo radio que el circuloDeCopia?");
        System.out.println(circulitoPorDefecto.getRadio() == circulitoDeCopia.getRadio());

    }
}
