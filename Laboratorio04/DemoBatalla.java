//laboratorio Nro 03 - DemoBatalla nuevo
//Autor: Llacho Delgado Samir Jaren 
package Laboratorio04;
import java.util.*;
public class DemoBatalla {
    public static int busquedaLinealNombre(Nave[] flota, String s){
        for (int i = 0; i < flota.length; i++) {
            if (flota[i].getNombre().equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public static void ordenarPorPuntosBurbuja(Nave[] flota){
        for (int i = 0; i < flota.length - 1; i++) {
            for (int j = 0; j < flota.length - i - 1; j++) {
                if (flota[j].getPuntos() > flota[j+1].getPuntos()) {
                    Nave temp = flota[j];
                    flota[j] = flota[j+1];
                    flota[j+1] = temp;
                }
            }
        }
    }

    public static void ordenarPorNombreBurbuja(Nave[] flota){
        for (int i = 0; i < flota.length - 1; i++) {
            for (int j = 0; j < flota.length - i - 1; j++) {
                if (flota[j].getNombre().compareTo(flota[j+1].getNombre()) > 0) {
                    Nave temp = flota[j];
                    flota[j] = flota[j+1];
                    flota[j+1] = temp;
                }
            }
        }
    }

    public static int busquedaBinariaNombre(Nave[] flota, String s){
        int izquierda = 0;
        int derecha = flota.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = s.compareTo(flota[medio].getNombre());
            if (comparacion == 0) {
                return medio;
            }
            if (comparacion < 0) {
                derecha = medio - 1;
            } else {
                izquierda = medio + 1;
            }
        }
        return -1;
    }

    public static void ordenarPorPuntosSeleccion(Nave[] flota){
        for (int i = 0; i < flota.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < flota.length; j++) {
                if (flota[j].getPuntos() < flota[minIndex].getPuntos()) {
                    minIndex = j;
                }
            }
            Nave temp = flota[minIndex];
            flota[minIndex] = flota[i];
            flota[i] = temp;
        }
    }

    public static void ordenarPorNombreSeleccion(Nave[] flota){
        for (int i = 0; i < flota.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < flota.length; j++) {
                if (flota[j].getNombre().compareTo(flota[minIndex].getNombre()) < 0) {
                    minIndex = j;
                }
            }
            Nave temp = flota[minIndex];
            flota[minIndex] = flota[i];
            flota[i] = temp;
        }
    }

    public static void ordenarPorPuntosInsercion(Nave[] flota){
        for (int i = 1; i < flota.length; i++) {
            Nave key = flota[i];
            int j = i - 1;
            while (j >= 0 && flota[j].getPuntos() > key.getPuntos()) {
                flota[j+1] = flota[j];
                j = j - 1;
            }
            flota[j+1] = key;
        }
    }

    public static void ordenarPorNombreInsercion(Nave[] flota){
        for (int i = 1; i < flota.length; i++) {
            Nave key = flota[i];
            int j = i - 1;
            while (j >= 0 && flota[j].getNombre().compareTo(key.getNombre()) > 0) {
                flota[j+1] = flota[j];
                j = j - 1;
            }
            flota[j+1] = key;
        }
    }
}
