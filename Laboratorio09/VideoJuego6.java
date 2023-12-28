import java.util.*;

public class VideoJuego6 {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        
        String[][] tablero = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "|-| ";
            }
        }
        Random random = new Random();
        int A = random.nextInt(10) + 1;
        int B = random.nextInt(10) + 1;
        Soldado[] ejercitoA = crearSoldados(A);
        Soldado[] ejercitoB = crearSoldados(B);

    }
    public static Soldado[] crearSoldados(int n){
        Random random = new Random();
        Soldado[] ejercito = new Soldado[n];

        for (int i = 0; i < n; i++) {
            String nombre = "Soldado" + i + " A";
            int nivelAtaque = random.nextInt(5) + 1;
            int nivelDefensa = random.nextInt(5) + 1;
            int nivelVida = random.nextInt(5) + 1;
            int vidaActual = nivelVida;
            int velocidad = random.nextInt(5) + 1;
            String actitud = "Neutral";
            boolean vive = true;

            ejercito[i] = new Soldado(nombre, nivelAtaque, nivelDefensa, nivelVida, vidaActual, velocidad, actitud, vive);
        }

        return ejercito;
    }
}
