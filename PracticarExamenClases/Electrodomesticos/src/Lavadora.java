public class Lavadora extends Electrodomesticos {

    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", "Samsung", 2.5);
        this.precio = 0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return this.precio;
    }

    public boolean getAguaCaliente() {
        return this.aguaCaliente;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    

}
