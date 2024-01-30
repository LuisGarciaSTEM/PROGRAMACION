public class Libro {

    private String titulo;
    private String autor;
    private final int ISBN; // Una vez que se le da un valor no puede cambiar (final)
    private int numPagina;

    /**
     * Constructor con parámetros.
     * Crear un libro con un título y ISNM especificados.
     * 
     * @param titulo El Título del libro.
     * @param ISBN   El ISBM del libro.
     */
    public Libro(String titulo, int ISBN) {
        this.titulo = titulo;
        this.autor = "(por defecto)";
        this.ISBN = ISBN;
        this.numPagina = 0;
    }

    /**
     * Constructor con parámetros.
     * Crear un libro con un título, autor, número de paginas y ISNM especificados.
     *
     * @param titulo    El título del libro.
     * @param autor     El autor del libro.
     * @param ISBN      El ISBN del libro.
     * @param numPagina El número de páginas del libro.
     */
    public Libro(String titulo, String autor, int ISBN, int numPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPagina = numPagina;
    }

    /**
     * Devolver la representación en formato cadena (String) del objeto Libro.
     * 
     * @return Una cadena que representar el objeto círculo.
     */
    @Override
    public String toString() {

        return " el libro " + this.titulo + ", de " + this.autor + ", con ISBN" + this.ISBN + ". Tiene " + this.numPagina
                + " páginas";
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Libro libro1 = new Libro("Las temopilas", 123456789);
        Libro libro2 = new Libro("Juego de tronos", "R.R.Martin",
                987654321, 600);

        System.out.println("Libro 1 ->" + libro1);
        System.out.println("Libro 2 ->" + libro2);
    }
}