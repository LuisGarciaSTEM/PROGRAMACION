package com.stem;

public class Nube {

    // Clase chiquitas que se usan dentro de nube.
    public enum TiposDeNubes {
        CIRROS,
        CUMULAS,
        ESTRATOS,
        NIMBOS
    }

    private TiposDeNubes tipo;
    private double altura;
    private double tamanio; // cm3

    public Nube() {
        this.tipo = TiposDeNubes.CIRROS;
        this.altura = 3000;
        this.tamanio = 1000;
    }

    public Nube(TiposDeNubes tipo, double altura, double tamanio) {
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public Nube(Nube n) {
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}