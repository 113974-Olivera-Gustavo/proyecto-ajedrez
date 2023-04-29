package org.example.piezas;

public class Alfil extends Pieza{

    public Alfil(String color, int fila, int columna) {
        super(color, fila, columna);
    }

    @Override
    public boolean esMovimientoValido(int filaDestino, int columnaDestino){
        //Verificar si el movimiento es diagonal
        if(Math.abs(filaDestino -this.fila )!= Math.abs(columnaDestino - this.columna) ){
            return false;
        }
        //Verifica si el camino hacia la casilla de destino esta despejado
        int filaActual = this.fila;
        int columnaActual = this.columna;
        while (filaActual != filaDestino && columnaActual != columnaDestino){
            filaActual+= Integer.compare(filaDestino,filaActual);
            columnaActual += Integer.compare(columnaDestino,columnaActual);
            
        }


        return true;
    }
}
