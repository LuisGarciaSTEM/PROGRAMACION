package com.stem;

import java.util.Scanner;

public class Nube {

    // Clase chiquitas que se usan dentro de nube.
    public enum TiposDeNubes {
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS;

        public static String mostrar() {
            return "[CIRROS, CUMULOS, ESTRATOS, NIMBOS]";
        }
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

    /*
     * public void unirNube(Nube nube1, Nube nube2) {
     * // Una nube que llega nueva une a this.nube si estan a la misma altura.
     * if (nube1.altura == nube2.altura) {
     * nube1.tamanio += nube2.tamanio;
     * nube2.tamanio = 0;
     * }
     * 
     * }
     */
    public double unirNube(Nube n) {
        // Una nube que llega nueva une a this.nube si estan a la misma altura.
        double salir = -1;
        if (this.altura == n.altura) {
            this.tamanio += n.tamanio;
            n.altura = 0;
            n.tamanio = 0;
            salir = this.tamanio;
        }
        return salir;

    }

    /*
     * Aumenta el tamaño de la nube en un 50%.
     */

    public double crecer() {
        /*
         * this.tamanio *= 1.5; // tamanio = tamanio + 0.5
         * double salir = -1;
         * double mitad = tamanio / 2;
         * this.tamanio += mitad;
         * salir = this.tamanio;
         */
        this.tamanio += 1.5;

        return this.tamanio;
    }

    /*
     * La nube sube los metros indicados.
     * 
     * @param metros indica el número de metros que sube la nube.
     */

    public double subir(double metros) {
        if (metros > 0) {
            this.altura += metros;

        }
        return this.altura;
    }

    public String toString() {
        return "Altura: " + this.altura + " tamaño: " + this.tamanio;
    }

    public static void main(String[] args) {
        // Hay que poner TiposDeNube.(lo que sea de las 4 opciones).
        Nube nube1 = new Nube(TiposDeNubes.NIMBOS, 10, 30);
        // Nube nube2 = new Nube(NIMBOS, 10, 30) --> ERROR ;
        // Nube nube3 = new Nube("TiposDeNubes.CUMULAS", 10, 30)--> ERROR ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce el tipo de nube [" + TiposDeNubes.mostrar() + "]");

        String tipoString = sc.nextLine().toUpperCase();

        TiposDeNubes tipoEmun = TiposDeNubes.valueOf(tipoString);

        Nube nube2 = new Nube(tipoEmun, 10, 30);

        System.out.println(nube1);
        System.out.println(nube2);
        // unirNube(nube1, nube2);
        System.out.println(nube1);
        System.out.println(nube2);

    }
}