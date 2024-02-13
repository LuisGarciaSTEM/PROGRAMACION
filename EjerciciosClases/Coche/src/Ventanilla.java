public class Ventanilla {
    private boolean transparencia; // Lo que no es transparente son tintados.
    private double tamanio;
    private boolean estado; // Subida o bajada.

    public Ventanilla() {
        this.transparencia = true;
        this.tamanio = 15;
        this.estado = true;
    }

    public Ventanilla(boolean transparencia, double tamanio) {
        this.transparencia = transparencia;
        this.tamanio = tamanio;
        this.estado = true;
    }

    public Ventanilla(Ventanilla v) {
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.estado;
    }

    public boolean getTransparencia() {
        return transparencia;
    }

    public double getTamanio() {
        return tamanio;
    }

    public boolean getEstado() {
        return transparencia;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setTransparencia(boolean transparencia) {
        this.transparencia = transparencia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        
    }
}
