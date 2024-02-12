package com.stem;

public class Nube {

    private double altura;
    private double tamanio;

    public Nube() {
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public Nube(double altura, double tamanio) {
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public Nube(Nube n) {
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