package org.example.piezas;

public class Torre extends Pieza {
    public Torre(String color, int fila, int columna){
        super(color, fila, columna);
    }

    public boolean esMovimientoValido(int fila, int columna){
        if(fila == getFila() || columna == getColumna()){
            return true;
        }
        else
            return false;
    }
}
