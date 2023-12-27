package Laboratorio04;
//laboratorio Nro 04 - Nave
//Autor: Llacho Delgado Samir Jaren
import java.util.*;
class Nave {
    private String nombre;
    private String columna;
    private int fila;
    private boolean estado;
    private int puntos;

    public Nave(String nombre, String columna, int fila, boolean estado, int puntos) {
        this.nombre = nombre;
        this.columna = columna;
        this.fila = fila;
        this.estado = estado;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nave [nombre=" + nombre + ", columna=" + columna + ", fila=" + fila + ", estado=" + estado
                + ", puntos=" + puntos + "]";
    }
}