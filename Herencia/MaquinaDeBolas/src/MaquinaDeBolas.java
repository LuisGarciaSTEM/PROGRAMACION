import java.util.ArrayList;

public class MaquinaDeBolas {

    private double precioDeLaBola;
    private ArrayList<Juguete> Juguetes;

    public MaquinaDeBolas() {
        this.precioDeLaBola = 0.50;
        this.Juguetes = new ArrayList<>();
    }

    public MaquinaDeBolas(double precioDeLaBola, ArrayList<Juguete> Juguetes) {
        super();
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
        } else {
            System.out.println("Tiene que ser múltiplo de 0.50");
        }

    }

    

}
