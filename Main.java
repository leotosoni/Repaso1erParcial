package com.company.leotosoni;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Libro caperucita = new Libro(782, 1992, "Caperucita Roja", Genero.CUENTOS);
        Libro corazonDelator = new Libro(62, 1997, "El Corazon Delator", Genero.POLICIALES);
        Libro historaSinFin = new Libro(58, 1998, "La Historia sin Fin", Genero.FANTASIA);


        Revista hola = new Revista(100, 2008, "HOLA");
        Revista cosmopolitan = new Revista(29, 2010, "COSMOPOLITAN");
        Revista fitness = new Revista(198, 2020, "FITNESS");

        Diario clarin = new Diario(2, 1990, "CLARIN");
        Diario nacion = new Diario(5, 1992, "LA NACION");
        Diario pagina12 = new Diario(11, 1997, "PAGINA 12");

        List<Item> biblioteca = new ArrayList<>();

        biblioteca.add(caperucita);
        biblioteca.add(corazonDelator);
        biblioteca.add(historaSinFin);
        biblioteca.add(fitness);
        biblioteca.add(hola);
        biblioteca.add(cosmopolitan);
        biblioteca.add(nacion);
        biblioteca.add(clarin);
        biblioteca.add(pagina12);


        caperucita.alquilar();
        fitness.alquilar();
        clarin.leerDiario();

        for (Item i : biblioteca) {
            if (i instanceof Libro || i instanceof Revista)
                ((Alquiler) i).alquilado();
            if (i instanceof Diario) {
                if (((Diario) i).leyendo == false)
                    System.out.println(((Diario) i).getTitular() + " esta disponible");
                else System.out.println(((Diario) i).getTitular() + " no esta disponible");
            }
        }


    }
}
