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
     * Obtener el Titulo actual del Libro.
     * 
     * @return El Titulo del Libro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Obtener el Autor actual del Libro.
     * 
     * @return El Autor del Libro.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Obtener el ISBN actual del Libro.
     * 
     * @return El ISBN del Libro.
     */
    public int getISBN() {
        return this.ISBN;
    }

    /**
     * Obtener el numPagina actual del Libro.
     * 
     * @return El numPagina del Libro.
     */
    public int getNumPagina() {
        return this.numPagina;
    }

    /**
     * Establece el Titulo del libro.
     * 
     * @param Titulo El núevo Titulo del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param autor El núevo autor del libro.
     */
    public void setAuthor(String autor) {
        this.autor = autor;
    }

    /**
     * Establece el numPaginas del libro.
     * 
     * @param numPaginas El núevo numPaginas del libro.
     */
    public void setNumPaginas(int numPagina) {
        this.numPagina = numPagina;
    }

    /**
     * Devolver la representación en formato cadena (String) del objeto Libro.
     * 
     * @return Una cadena que representar el objeto Libro.
     */
    @Override
    public String toString() {

        return " el libro " + this.titulo + ", de " + this.autor + ", con ISBN" + this.ISBN + ". Tiene "
                + this.numPagina + " páginas";
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Libro libro1 = new Libro("Las temopilas", 123456789);
        Libro libro2 = new Libro("Juego de tronos", "R.R.Martin",
                987654321, 600);

        System.out.println("Libro 1 ->" + libro1);
        System.out.println("Libro 2 ->" + libro2);

        /**
         * El número de páginas introducidas no puede ser menor que 0.
         * Si al crear el objeto, se introduce un número de páginas negativas se cambia
         * a 0.
         * Si al cambiar el valor del número de paginas es negativa, se deja el que
         * estaba.
         * 
         * Tanto el título como el author no pueden tener más de 20 caracteres.
         * En caso de que tengan más el título se trunca y el author se pone las
         * iniciales.
         * 
         */

    }
}