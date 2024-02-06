/*PERSIANA
Atributos: El tamaño que no puede ser negativo de la persiana y si está subida o no por 
defecto estará bajada.
Métodos:
subir() .- Permite subir la persiana.
bajar() .- Permite bajar la persiana.
 */
public class Persiana {

    private double tamanio;
    private boolean estaSubida;

    public Persiana() {
        this.tamanio = 0;
        this.estaSubida = false;
    }

    public Persiana(double tamanio, boolean estaSubida) {
        this.tamanio = tamanio;
        this.estaSubida = estaSubida;
    }

    public Persiana(Persiana p) {
        this.tamanio = p.tamanio;
        this.estaSubida = p.estaSubida;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
