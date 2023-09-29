package Laboratorio05;
import java.util.*;

public class VideoJuego2 {
    public static void main(String[] args) {
        int tamano = 5; 
        Soldado[][] tablero = new Soldado[tamano][tamano];
        for (int i = 0; i < 10; i++) {
            Soldado.generarPosicion(tablero, tamano);
        }
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                System.out.print((soldado != null ? soldado.getNombre() : "_________") + " | ");
            }
            System.out.println();
        }
        Soldado soldadoConMayorVida = encontrarSoldadoConMayorVida(tablero);
        double promedio = calcularPromedioPuntosVida(tablero);
        int nivelDeVidaTotal = calcularNivelVidaTotal(tablero);
        System.out.println("\nSoldado con mayor vida: " + soldadoConMayorVida);
        System.out.println("Promedio de puntos de vida: " + promedio);
        System.out.println("Nivel de vida total del ejército: " + nivelDeVidaTotal);
        System.out.println("\nDatos de todos los soldados:");
        mostrarSoldados(tablero);
        System.out.println("\nRanking de poder:");
        mostrarRanking(tablero);
    }

    public static Soldado encontrarSoldadoConMayorVida(Soldado[][] tablero) {
        Soldado soldadoConMayorVida = null;
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                if (soldado != null) {
                    if (soldadoConMayorVida == null || soldado.getPuntosVida() > soldadoConMayorVida.getPuntosVida()) {
                        soldadoConMayorVida = soldado;
                    }
                }
            }
        }
        return soldadoConMayorVida;
    }

    public static double calcularPromedioPuntosVida(Soldado[][] tablero) {
        int totalPuntosVida = 0;
        int cantidadSoldados = 0;
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                if (soldado != null) {
                    totalPuntosVida += soldado.getPuntosVida();
                    cantidadSoldados++;
                }
            }
        }
        return (double) totalPuntosVida / cantidadSoldados;
    }

    public static int calcularNivelVidaTotal(Soldado[][] tablero) {
        int nivelVidaTotal = 0;
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                if (soldado != null) {
                    nivelVidaTotal += soldado.getPuntosVida();
                }
            }
        }
        return nivelVidaTotal;
    }

    public static void mostrarSoldados(Soldado[][] tablero) {
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                if (soldado != null) {
                    System.out.println(soldado);
                }
            }
        }
    }

    public static void mostrarRanking(Soldado[][] tablero) {
        Soldado[] soldados = obtenerSoldados(tablero);
        Arrays.sort(soldados, (s1, s2) -> s2.getPuntosVida() - s1.getPuntosVida());
        for (int i = 0; i < soldados.length; i++) {
            System.out.println((i + 1) + ". " + soldados[i].getNombre() + " - Puntos de Vida: " + soldados[i].getPuntosVida());
        }
    }

    public static Soldado[] obtenerSoldados(Soldado[][] tablero) {
        Soldado[] soldados = new Soldado[tablero.length * tablero[0].length];
        int indice = 0;
        for (Soldado[] fila : tablero) {
            for (Soldado soldado : fila) {
                if (soldado != null) {
                    soldados[indice++] = soldado;
                }
            }
        }
        return Arrays.copyOf(soldados, indice); 
    }
}
