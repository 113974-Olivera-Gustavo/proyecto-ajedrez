package org.example.piezas;

import java.awt.*;

public abstract class Pieza {
    //Codigo de piezas
    protected String color;
    protected int fila;
    protected int columna;

    public Pieza(String color, int fila, int columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    public abstract boolean esMovimientoValido(int filaDestino, int columnaDestino);
}
