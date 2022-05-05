package com.company.leotosoni;

import java.time.LocalDate;

public class Revista extends Item implements Alquiler{

    private String titular;
    private boolean alquilado = false;

    public Revista(int codigo, int anioPubliacion, String titular) {
        super(codigo, anioPubliacion);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void alquilar() {
        if (this.alquilado == false) {
            System.out.println("Alquilar " + this.titular);
            this.alquilado = true;
        } else System.out.println("ERROR AL ALQUILAR " + this.titular);


    }

    @Override
    public void devolver() {
        if (this.alquilado) {
            System.out.println("Se devuelve " + this.titular);
            this.alquilado = false;
        } else System.out.println("EEROR AL DEVOLVER " + this.titular);

    }

    @Override
    public void alquilado() {
        if(this.alquilado)
            System.out.println(this.titular + " esta alquilada");
        else System.out.println(this.titular + " no esta alquilada");

    }
}
