import java.util.Scanner;

/**
 * Define un círculo, con su radio y su color.
 * 
 * @author: Luis García Díaz.
 * @version 1.0
 * 
 */

// Hacemos el comentario con doble //
/* Hacemos el comentario con */

public class Circulo {

    // Atributos de la clase, en este caso (circulo).
    private int radio = 5;
    private String color;

    // Métodos de la clase.

    // Constructor() -> Por defecto.
    /**
     * Constructor por defecto.
     * Crea un cículo blanco con radio 1.
     */
    public Circulo() {
        this.radio = 1;
        this.color = "blanco";
    }

    // Constructor(int radio, String color) -> Con parámetros.
    /**
     * Constructor con parámetros.
     * Crea un cículo con un radio y color, especificados.
     * 
     * @param radio El radio del círculo.
     * @param color El color del círculo.
     * @see Circulo#setRadio(int radio)
     */
    public Circulo(int radio, String color) {
        this.setRadio(radio);
        this.color = color;
    }

    /**
     * Constructor de copia.
     * Crea un círculo con un radio y color obtenido a partir de otro círculo.
     * 
     * @param c El círculo a copiar.
     */
    // Constructor(Circulo c) -> De copia.
    public Circulo(Circulo c) {
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Conseguir la información de los atributos. Y se le pone get+Nombre
    /**
     * Obtener el radio actual del círculo.
     * 
     * @return El radio del círculo.
     */
    public int getRadio() {
        return this.radio;
    }

    /**
     * Obtener el color actual del círculo.
     * 
     * @return El color del círculo.
     */
    public String getColor() {
        return this.color;
    }

    // Set -> Establecer la informacion a los atributos.
    /**
     * Establece el radio del cículo.
     * En caso de que el radio sea menor que cero(0), lo establece a 1.
     * 
     * @param radio El núevo radio del circulo.
     */
    public void setRadio(int radio) {
        this.radio = radio;
        if (radio < 1) {
            this.radio = 1;
        }
    }

    /**
     * Establece el color del cículo.
     * 
     * @param radio El núevo color del circulo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calcular el área del círculo.
     * 
     * @return area El area del círculo.
     */

    public double calcularArea() {
        return Math.PI * this.radio * this.radio;
        // Math.pow(this.radio, 2)
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Siempre se tiene que llamar así, porque java asume que cuando queremos
    // mostrar por pantalla un circulo(print), tiene que llamar a toString() y
    // siempre encima del main.
    /**
     * Devolver la representación en formato cadena (String) del objeto círculo.
     * 
     * @return Una cadena que representar el objeto círculo.
     */
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

        System.out.println("¿El círculo por defecto tiene el mismo radio " + "que el circuloDeCopia?");
        System.out.println(circulitoPorDefecto.getRadio() == circulitoDeCopia.getRadio());
        System.out.println("El area de circulito de copia: [" + circulitoDeCopia + "] es "
                + circulitoDeCopia.calcularArea());
    }
}
