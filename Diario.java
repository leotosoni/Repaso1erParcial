package com.company.leotosoni;

import java.time.LocalDate;

public class Diario extends Item{

    private String titular;
    boolean leyendo = false;

    public Diario(int codigo, int anioPubliacion, String titular) {
        super(codigo, anioPubliacion);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void leerDiario(){
        this.leyendo = true;
        System.out.println("El diario se esta leyendo");
    }

    public void dejarLeerDiario(){
        this.leyendo = false;
        System.out.println("El diario NO se esta leyendo");
    }

    public boolean seEstaLeyendo(){
        return leyendo;
    }
}
