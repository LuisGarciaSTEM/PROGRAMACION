public class Libro {
    
    private String titulo;
    private String autor;
    private final int ISBN; // Una vez que se le da un valor no puede cambiar (final) 
    private int numPagina;
    
    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.ISBN = ISBN;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
