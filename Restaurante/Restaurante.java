import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurante {

    private String nombre;
    private int aforo = 30;
    private ArrayList<Reserva> listaReservas;

    public Restaurante(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = 4;
        setAforo(aforo);
        this.listaReservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getListaReservas() {
        return this.listaReservas;
    }

    public int getAforo() {
        return this.aforo;
    }

    public void setAforo(int aforo) {
        if (aforo >= 4)
            this.aforo = aforo;
    }

    private boolean comprobarDisponibilidad(LocalDate fecha, int numComensales) {
        int numComensalesReservados = 0;
            for (Reserva reserva : listaReservas) {
                if (fecha.equals(reserva.getFecha())) numComensalesReservados += reserva.getNumComensales() ;
                
            }
        return (this.aforo >= numComensalesReservados + numComensales);
    }

    public boolean resevar(String nombre, LocalDate fecha, int numComensales) {
        boolean disponible = comprobarDisponibilidad(fecha, numComensales);
        if (disponible) {
            Reserva r = new Reserva(nombre,numComensales , fecha);
            this.listaReservas.add(r);
        }
        return disponible;
    }

    @Override
    public String toString() {
        return "El restaurante " + this.nombre + " con aforo de " + this.aforo + " personas "
                + "lleva " + this.listaReservas.size() + " reservas hechas";
    }

}
