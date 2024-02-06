/*VENTANA
Atributos: El tamaño no puede ser negativo de la ventana, el nivel de transparencia del cristal en porcentaje, siento 100 totalmente transparente, si está abierta o no por defecto estará cerrada y una persina que no puede ser mayor que la ventana.
Métodos:
abrir() .- Permite abrir la persiana.
cerrar() .- Permite cerrar la persiana. */

public class Ventana {

    private double tamanio;
    private int transparencia;
    private boolean estaAbierta;
    private Persiana persiana;

    public Ventana() {
        this.tamanio = 0;
        this.transparencia = 100;
        this.estaAbierta = false;
        this.persiana = new Persiana();
    }

    public Ventana(double tamanio, int transparencia, boolean estaAbierta, Persiana persiana) {
        this.tamanio = 0;
        this.setTaminio(tamanio);
        this.transparencia = transparencia; // Restringir, no mas del 100 y menos de 0.
        this.estaAbierta = estaAbierta;
        this.persiana = persiana;
    }

    public Ventana(double tamanio, int transparencia, boolean estaAbierta) {
        this.tamanio = 0;
        this.setTaminio(tamanio);
        this.transparencia = transparencia; // Restringir, no mas del 100 y menos de 0.
        this.estaAbierta = estaAbierta;
        this.persiana = new Persiana(this.tamanio);
    }

    

    public Ventana(Ventana p) {
        this.tamanio = p.tamanio;
        this.transparencia = p.transparencia;
        this.estaAbierta = p.estaAbierta;
        this.persiana = p.persiana.clone();
    }

    public double getTaminio() {
        return this.tamanio;
    }

    public void setTaminio(double tamanio) {
        if (tamanio > 0)
            this.tamanio = tamanio;
    }

    public static void main(String[] args) {

    }
}
