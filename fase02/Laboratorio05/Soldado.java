//laboratorio Nro 05 - Soldado
//Autor: Llacho Delgado Samir Jaren
package Laboratorio05;
import java.util.*;
public class Soldado {
    private String nombre;
    private int puntosVida;
    private int fila;
    private int columna;
    public Soldado(String nombre, int puntosVida, int fila, int columna) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.fila = fila;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Puntos de Vida: " + puntosVida + ", Fila: " + fila + ", Columna: " + columna;
    }
    public static String generarNombre(int numero) {
        return "Soldado" + numero;
    }

    public static int generarPuntosVida() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public static void generarPosicion(Soldado[][] tablero, int tamano) {
        Random random = new Random();
        int fila, columna;

        do {
            fila = random.nextInt(tamano);
            columna = random.nextInt(tamano);
        } while (tablero[fila][columna] != null);

        tablero[fila][columna] = new Soldado(generarNombre(fila * tamano + columna), generarPuntosVida(), fila, columna);
    }
}