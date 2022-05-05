package com.company.leotosoni;

import java.time.LocalDate;

public class Libro extends Item implements Alquiler {
    private String titulo;
    private Enum genero;
    private boolean alquilado = false;

    public Libro(int codigo, int anioPubliacion, String titulo, Enum genero) {
        super(codigo, anioPubliacion);
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void alquilar() {
        if (this.alquilado == false) {
            System.out.println("Alquilar " + this.titulo);
            this.alquilado = true;
        } else System.out.println("ERROR AL ALQUILAR " + this.titulo);


    }

    @Override
    public void devolver() {
        if (this.alquilado) {
            System.out.println("Se devuelve " + this.titulo);
            this.alquilado = false;
        } else System.out.println("EEROR AL DEVOLVER " + this.titulo);

    }

    @Override
    public void alquilado() {
        if(this.alquilado)
        System.out.println(this.titulo + " esta alquilada");
        else System.out.println(this.titulo + " no esta alquilada");

    }
}
