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
        this.autor = "";
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

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
