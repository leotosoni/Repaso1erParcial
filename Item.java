package com.company.leotosoni;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Item {
    private int codigo;
    private int anioPubliacion;

    public Item(int codigo, int anioPubliacion) {
        this.codigo = codigo;
        this.anioPubliacion = ((anioPubliacion >= 1990) && (anioPubliacion <= 2022)) ? anioPubliacion : 1990;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnioPubliacion() {
        return anioPubliacion;
    }
}
