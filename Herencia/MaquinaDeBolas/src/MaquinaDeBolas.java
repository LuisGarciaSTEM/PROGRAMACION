import java.util.ArrayList;
import java.util.Random;

public class MaquinaDeBolas {

    private double precioDeLaBola;
    private ArrayList<Juguete> Juguetes;

    public MaquinaDeBolas() {
        this.precioDeLaBola = 0.50;
        this.Juguetes = new ArrayList<>();
    }

    public MaquinaDeBolas(double precioDeLaBola, ArrayList<Juguete> Juguetes) {
        this();
        setPrecioDeLaBola(precioDeLaBola);
        setJuguetes(Juguetes);
    }

    public ArrayList<Juguete> getJuguetes() {
        return Juguetes;
    }

    public double getPrecioDeLaBola() {
        return precioDeLaBola;
    }

    public void setJuguetes(ArrayList<Juguete> juguetes) {
        Juguetes = juguetes;
    }

    public void setPrecioDeLaBola(double precioDeLaBola) {
        if (precioDeLaBola % 0.50 == 0) {
            this.precioDeLaBola = precioDeLaBola;
        } 
    }

    public Juguete obtenerJugueteAleatorio(ArrayList<Juguete> listaJuguetes) {
        Random rand = new Random();

        int indiceAleatorio = rand.nextInt(listaJuguetes.size());
        return listaJuguetes.get(indiceAleatorio);


    }

    @Override
    public String toString() {
        return "Nombre: " + this.jugueteAleatorio + ", Precio: " + this.getPrecioDeLaBola() + " euros";
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        ArrayList<Juguete> listaJuguetes = new ArrayList<>();
        listaJuguetes.add(new Juguete("Juguete 1", 10.0));
        listaJuguetes.add(new Juguete("Juguete 2", 15.0));
        listaJuguetes.add(new Juguete("Juguete 3", 20.0));
        listaJuguetes.add(new Juguete("Juguete 4", 25.0));
        listaJuguetes.add(new Juguete("Juguete 5", 30.0));


        MaquinaDeBolas nuestraMaquina = new MaquinaDeBolas(0.50, listaJuguetes);
        Juguete jugueteAleatorio = nuestraMaquina.obtenerJugueteAleatorio(listaJuguetes);

        System.out.println(nuestraMaquina);
        System.out.println("Juguete aleatorio obtenido: " + jugueteAleatorio);
    }

}
