import java.util.Random;

public class VideoJuego6 {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        String[] soldados = new String[2];
        String[][] tablero = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "|-| ";
            }
        }
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        crearSoldadosA(n, soldados);
    }
    public static String[] crearSoldadosA(int n, String[] soldados){


        return ;
    }
}
