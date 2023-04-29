package org.example.piezas;

public class Peon extends Pieza{
    public Peon(String color, int fila, int columna){
        super(color,fila,columna);
    }

    public boolean esMovimientoValido(int fila, int columna){
        int diffFila = fila - getFila();
        int diffColumna = columna - getColumna();

        //Verifica que el movimiento sea valido para el peon
        if(getColor().equals("Blanco")){
            if(diffFila == 0 && diffColumna == -1){
                return true; //Movimiento hacia adelante
            }
            else if(getFila() == 6 && diffColumna == -2){
                return true; //Movimiento inicial de dos casillas hacia adelante
            }
            else if(diffFila == -1 && diffColumna == -1){
                return true; //Movimiento diagonal para comer piezas
            }
            else if (diffFila == 1 && diffColumna == -1){
                return true; //Movimiento diagonal para comer piezas
            }
            else
                return false;
        }
        else if(getColor().equals("Negro")){
            if(diffFila == 0 && diffColumna == 1){
                return true; //Movimiento hacia adelante
            } else if (getFila() == 1 && diffFila == 0 && diffColumna == 2) {
                return true; // Movimiento incial de dos casillas hacia adelante
            }
            else if (diffFila == -1 && diffColumna == 1){
                return true; //Movimiento diagonal para comer piezas
            } else if (diffFila == 1 && diffColumna == 1) {
                return true; ////Movimiento diagonal para comer piezas
            }
            else
                return false;
        }
        else
            return false;
    }
}
