public class Ventanilla {
    private boolean transparencia; // Lo que no es transparente son tintados.
    private double tamanio; 
    private boolean estado; // Subida o bajada.

    public Ventanilla(){
        this.transparencia = transparencia;
        this.transparencia = true;
        this.tamanio = tamanio;
        this.tamanio = 15; 
        this.estado = estado; 
        this.estado = true;  
    }

    public Ventanilla(boolean transparencia, double tamanio){
        this.transparencia = transparencia; 
        this.tamanio = tamanio; 
        this.estado = true;   
    }

    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio; 
        this.estado = v.estado; 
    }


    public double getTamanio() {
        return tamanio;
    }
    



    public static void main(String[] args) {
        
    }
}
