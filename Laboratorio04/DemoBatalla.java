//laboratorio Nro 04 - DemoBatalla 
//Autor: Llacho Delgado Samir Jaren
package Laboratorio04;
import java.util.*;
public class DemoBatalla {
    public static void main(String[] args) {
        Nave[] misNaves = new Nave[8];
        Scanner sc = new Scanner(System.in);
        String nombre, columna;
        int fila, puntos;
        boolean estado;

        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i + 1));
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.println("Fila ");
            fila = sc.nextInt();
            System.out.print("Columna: ");
            columna = sc.next();
            System.out.print("Estado: ");
            estado = sc.nextBoolean();
            System.out.print("Puntos: ");
            puntos = sc.nextInt();
            misNaves[i] = new Nave(nombre, columna, fila, estado, puntos);
        }

        System.out.println("\nNaves creadas:");
        mostrarNaves(misNaves);
        mostrarPorNombre(misNaves);
        mostrarPorPuntos(misNaves);
        Nave naveMayorPuntos = mostrarMayorPuntos(misNaves);
        if (naveMayorPuntos != null) {
            System.out.println("\nNave con mayor número de puntos: " + naveMayorPuntos.getNombre());
        }

        sc.close();
    }

    public static void mostrarNaves(Nave[] flota) {
        for (Nave nave : flota) {
            System.out.println(nave.toString());
        }
    }

    public static void mostrarPorNombre(Nave[] flota) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la nave a buscar:");
        String nombreBuscado = sc.next();

        boolean encontrado = false;
        for (Nave nave : flota) {
            if (nave.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(nave.toString());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nave no encontrada.");
        }
    }

    public static void mostrarPorPuntos(Nave[] flota) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de puntos máximo:");
        int puntosMaximos = sc.nextInt();

        for (Nave nave : flota) {
            if (nave.getPuntos() <= puntosMaximos) {
                System.out.println(nave.toString());
            }
        }
    }

    public static Nave mostrarMayorPuntos(Nave[] flota) {
        if (flota.length == 0) {
            System.out.println("No hay naves en la flota.");
            return null;
        }

        Nave mayorPuntos = flota[0];
        for (Nave nave : flota) {
            if (nave.getPuntos() > mayorPuntos.getPuntos()) {
                mayorPuntos = nave;
            }
        }

        return mayorPuntos;
    }
}