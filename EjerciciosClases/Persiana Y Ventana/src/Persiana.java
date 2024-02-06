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
        this.tamanio = 0;
        this.setTaminio(tamanio);
        this.estaSubida = estaSubida;
    }

    public Persiana(Persiana p) {
        this.tamanio = p.tamanio;
        this.estaSubida = p.estaSubida;
    }

    public double getTaminio() {
        return this.tamanio;
    }

    public boolean getEstaSubida() {
        return this.estaSubida;
    }

    public void setTaminio(double tamanio) {
        if (tamanio > 0)
            this.tamanio = tamanio;
    }

    // Podemos hacer privado el set, porque tenemos los métodos subir() y bajar()
    // realizar su función.
    private void setEstaSubida(boolean estaSubida) {
        this.estaSubida = estaSubida;
    }

    public void subir() {
        // this.estaSubida = true pero si hay alguna comprobación en el set, no la hace.
        this.setEstaSubida(true);
    }

    public void bajar(){
        this.setEstaSubida(false);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
