import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String ciudad;
    private int anio;
    private int adscritos;
    private ArrayList<Libro> listaLibros;

    private static double presupuestoPorPersona = 0.75;

    public Biblioteca (String nombre, String ciudad, int anio){
        this.nombre = nombre;
        this.ciudad = ciudad;

        this.anio = 2024;
        setAnio(anio);

        this. adscritos = 0;
        this.listaLibros = new ArrayList<Libro>();
    }

    public Biblioteca (String nombre, String ciudad, int anio, int adscritos, ArrayList<Libro> listaLibros){
        this.nombre = nombre;
        this.ciudad = ciudad;

        this.anio = 2024;
        this.setAnio(anio);

        this.adscritos = 0;
        this.setAdscritos(adscritos);

        this.listaLibros = (ArrayList)listaLibros.clone();
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getCiudad(){
        return this.ciudad;
    }
    public int getAnio(){
        return this.anio;
    }
    public int getAdscritos(){
        return this.adscritos;
    }
    public ArrayList<Libro> getListaLibros(){
        return this.listaLibros;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setAnio(int anio){
        if (anio >= 1218 && anio <= 2024) this.anio = anio;
    }
    public void setAdscritos(int adscritos){
        if (adscritos >= 0) this.adscritos = adscritos;
    }
    public void setListaLibros(ArrayList<Libro> listaLibros){
        this.listaLibros = listaLibros;
    }

    public double calcularPresupuesto(){
        return this.adscritos*presupuestoPorPersona;
    }

    public String toString(){
        return "La biblioteca " + this.nombre + " de " + this.ciudad + " (" + this.anio + ") tiene adscritas " + this.adscritos + " personas y cuenta con " + this.listaLibros.size() + " libros.";
    }


    public static void main (String[] args){
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", 841761,2020,400);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie",849129,2021,400);
        Libro libro3 = new Libro("Oso","Marian Engel",841597,1976,168);
        
        ArrayList<Libro> librosSalon = new ArrayList<Libro>();
        librosSalon.add(libro1);
        librosSalon.add(libro2);

        Biblioteca biblio1 = new Biblioteca("Salon","Granada",1917,32916,librosSalon);
        Biblioteca biblio2 = new Biblioteca("Nueva","Granada",2023);
        System.out.println(biblio1);
        System.out.println(biblio2);

        double presupuesto1 = biblio1.calcularPresupuesto();
        double presupuesto2 = biblio2.calcularPresupuesto();

        System.out.println("El presupuesto de la biblioteca1 es: " + presupuesto1 + " euros");
        System.out.println("El presupuesto de la biblioteca2 es: " + presupuesto2 + " euros");

    }

}
