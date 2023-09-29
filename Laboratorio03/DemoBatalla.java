//laboratorio Nro 03 - DemoBatalla
//Autor: Llacho Delgado Samir Jaren
import java.util.*;
public class DemoBatalla {
    public static void main(String [] args){
        Nave [] misNaves = new Nave[10];
        Scanner sc = new Scanner(System.in);
        String nomb, col;
        int fil, punt;
        boolean est;
        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i+1));
            System.out.print("Nombre: ");
            nomb = sc.next();
            System.out.println("Fila ");
            fil = sc.nextInt();
            System.out.print("Columna: ");
            col = sc.next();
            System.out.print("Estado: ");
            est = sc.nextBoolean();
            System.out.print("Puntos: ");
            punt = sc.nextInt();
            misNaves[i] = new Nave(); 
            misNaves[i].setNombre(nomb);
            misNaves[i].setFila(fil);
            misNaves[i].setColumna(col);
            misNaves[i].setEstado(est);
            misNaves[i].setPuntos(punt);
        }
        System.out.println("\nNaves creadas:");
        mostrarNaves(misNaves);
        mostrarPorNombre(misNaves);
        mostrarPorPuntos(misNaves);
        System.out.println("\nNaves desordenadas:");
        mostrarNaves(misNaves);
        misNaves = Lucha(misNaves);
        System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves));
    }
    
    public static void mostrarNaves(Nave [] flota){
        for (Nave nave : flota) {
            System.out.println("Nombre: " + nave.getNombre());
            System.out.println("Fila: " + nave.getFila());
            System.out.println("Columna: " + nave.getColumna());
            System.out.println("Estado: " + nave.getEstado());
            System.out.println("Puntos: " + nave.getPuntos());
            System.out.println("----------");
        }
    }

    public static void mostrarPorNombre(Nave [] flota){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la nave: ");
        String nombreBuscado = sc.next();
        for (Nave nave : flota) {
            if (nave.getNombre().equals(nombreBuscado)) {
                System.out.println("Nombre: " + nave.getNombre());
                System.out.println("Fila: " + nave.getFila());
                System.out.println("Columna: " + nave.getColumna());
                System.out.println("Estado: " + nave.getEstado());
                System.out.println("Puntos: " + nave.getPuntos());
                System.out.println("----------");
            }
        }
    }
    public static void mostrarPorPuntos(Nave [] flota){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de puntos: ");
        int puntosBuscados = sc.nextInt();
        for (Nave nave : flota) {
            if (nave.getPuntos() <= puntosBuscados) {
                System.out.println("Nombre: " + nave.getNombre());
                System.out.println("Fila: " + nave.getFila());
                System.out.println("Columna: " + nave.getColumna());
                System.out.println("Estado: " + nave.getEstado());
                System.out.println("Puntos: " + nave.getPuntos());
                System.out.println("----------");
            }
        }
    }
    public static Nave mostrarMayorPuntos(Nave [] flota){
        Nave naveMayorPuntos = flota[0];
        for (Nave nave : flota) {
            if (nave.getPuntos() > naveMayorPuntos.getPuntos()) {
                naveMayorPuntos = nave;
            }
        }
        return naveMayorPuntos;
    }
    public static Nave[] Lucha(Nave[] flota){
        Random rand = new Random();
        for (int i = flota.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Nave temp = flota[i];
            flota[i] = flota[j];
            flota[j] = temp;
        }
        return flota;
    }
}