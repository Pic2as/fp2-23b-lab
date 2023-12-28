import java.util.*;

public class VideoJuego6 {
    public static void main(String[] args) {
        int filas = 10;
        int columnas = 10;
        
        String[][] tablero = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "--";
            }
        }
        Random random = new Random();
        int nA = random.nextInt(10) + 1;
        int nB = random.nextInt(10) + 1;
        String idA = "A";
        String idB = "B";
        Soldado[] ejercitoA = crearSoldados(nA,idA);
        Soldado[] ejercitoB = crearSoldados(nB,idB);

        mostrarListaSoldados(ejercitoB);
        mostrarListaSoldados(ejercitoA);

        ubicarEjercito(tablero,ejercitoA, idA);
        ubicarEjercito(tablero,ejercitoB, idB);

        mostrarTablero(tablero);

    }
    public static Soldado[] crearSoldados(int n, String id){
        Random random = new Random();
        Soldado[] ejercito = new Soldado[n];

        for (int i = 0; i < n; i++) {
            String nombre = "Soldado " + i + id;
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

    // Método para ubicar un ejército en el tablero con la letra correspondiente
    public static void ubicarEjercito(String[][] tablero, Soldado[] soldado, String id) {
        Random random = new Random();

        for (int i = 0; i < soldado.length; i++) {
            int filaSoldado = random.nextInt(tablero.length);
            int columnaSoldado = random.nextInt(tablero[0].length);

            // Verificar que la posición esté vacía antes de colocar al soldado
            while (!tablero[filaSoldado][columnaSoldado].equals("--")) {
                filaSoldado = random.nextInt(tablero.length);
                columnaSoldado = random.nextInt(tablero[0].length);
            }

            tablero[filaSoldado][columnaSoldado] = i + id;
            soldado[i].setNombre("Soldado" + i + id);
        }
    }
    public static void mostrarTablero(String[][] tablero) {
        for (String[] fila : tablero) {
            for (String casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }
    }
    public static void mostrarListaSoldados(Soldado[] ejercito) {
        for (Soldado soldado : ejercito) {
            System.out.println("Soldado: " + soldado.getNombre());
        }
    }
}
