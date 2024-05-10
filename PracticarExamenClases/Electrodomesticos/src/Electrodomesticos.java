public class Electrodomesticos {

    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomesticos(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getPotencia() {
        return this.potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    private double getConsumo(int horas) {
        double total = potencia * horas;
        return total;
    }

    private double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }

    @Override
    public String toString() {
        return "El electrodomestico " + this.tipo + " de marca" + this.marca +
                " tiene una potencia " + this.potencia + "kw";
    }

    public static void main(String[] args) {

        Electrodomesticos miElectrodomestico = new Electrodomesticos("Lavadora", "Sansumg", 1.5);
        
        System.out.println(miElectrodomestico);

        int horas = 3;
        double costeHora= 2.5;

        miElectrodomestico.getConsumo(horas);
        System.out.println("Consumo total de kW durante " + horas + " horas: " + costeHora + " kW");
        
        miElectrodomestico.getCosteConsumo(horas, costeHora);
        System.out.println("Coste total de consumo durante " + horas + " horas: $" + costeHora);
    }

}
