package Restaurante;

import java.time.LocalDate;

public class Reserva {

    private String nombre;
    private int numComensales;
    private LocalDate fecha;

    public Reserva(String nombre, int numComensales, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = LocalDate.now();
        setFecha(fecha);
        this.numComensales = 1;
        setNumComensales(numComensales);
    }

    public void setFecha(LocalDate fecha) {
        if (fecha.isAfter(LocalDate.now()))
            this.fecha = fecha;

    }

    public void setNumComensales(int numComensales) {
        if (numComensales > 0)
            this.numComensales = numComensales;

    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public int getNumComensales() {
        return this.numComensales;
    }

    @Override
    public String toString() {
        return "La reserva para " + this.numComensales + " el día " + this.fecha
                + " está a nombre de " + this.nombre;
    }

}
