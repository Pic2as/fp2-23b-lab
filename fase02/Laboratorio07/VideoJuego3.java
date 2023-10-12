
import java.util.*;

public class VideoJuego3 {
    private static final int TABLERO_SIZE = 5;

    private List<List<Soldado>> tablero = new ArrayList<>();
    private List<Soldado> ejercito1 = new ArrayList<>();
    private List<Soldado> ejercito2 = new ArrayList<>();

    public VideoJuego3() {
        // Inicializar el tablero
        for (int i = 0; i < TABLERO_SIZE; i++) {
            List<Soldado> fila = new ArrayList<>();
            for (int j = 0; j < TABLERO_SIZE; j++) {
                fila.add(null);
            }
            tablero.add(fila);
        }

        // Crear Soldados para el Ejército 1
        for (int i = 0; i < 10; i++) {
            String nombre = "Soldado1X" + (i+1);
            int puntosDeVida = new Random().nextInt(5) + 1;
            int fila = new Random().nextInt(TABLERO_SIZE);
            int columna = new Random().nextInt(TABLERO_SIZE);
            while (tablero.get(fila).get(columna) != null) {
                fila = new Random().nextInt(TABLERO_SIZE);
                columna = new Random().nextInt(TABLERO_SIZE);
            }
            Soldado soldado = new Soldado(nombre, puntosDeVida, fila, columna);
            ejercito1.add(soldado);
            tablero.get(fila).set(columna, soldado);
        }

        // Crear Soldados para el Ejército 2
        for (int i = 0; i < 10; i++) {
            String nombre = "Soldado2X" + (i+1);
            int puntosDeVida = new Random().nextInt(5) + 1;
            int fila = new Random().nextInt(TABLERO_SIZE);
            int columna = new Random().nextInt(TABLERO_SIZE);
            while (tablero.get(fila).get(columna) != null) {
                fila = new Random().nextInt(TABLERO_SIZE);
                columna = new Random().nextInt(TABLERO_SIZE);
            }
            Soldado soldado = new Soldado(nombre, puntosDeVida, fila, columna);
            ejercito2.add(soldado);
            tablero.get(fila).set(columna, soldado);
        }
    }

    // Métodos para obtener información de los soldados y ejércitos

    // ... (implementar según sea necesario)

    // Método para determinar el ganador de la batalla
    public String determinarGanador() {
        int totalPuntosEjercito1 = ejercito1.stream().mapToInt(Soldado::getPuntosDeVida).sum();
        int totalPuntosEjercito2 = ejercito2.stream().mapToInt(Soldado::getPuntosDeVida).sum();

        if (totalPuntosEjercito1 > totalPuntosEjercito2) {
            return "Ejército 1";
        } else if (totalPuntosEjercito1 < totalPuntosEjercito2) {
            return "Ejército 2";
        } else {
            return "Empate";
        }
    }

    public static void main(String[] args) {
        VideoJuego3 juego = new VideoJuego3();

        // Mostrar información solicitada
        // ...

        // Ejemplo de cómo obtener los datos del Soldado con mayor vida de cada ejército
        Soldado soldadoMasFuerteEjercito1 = Collections.max(juego.ejercito1, Comparator.comparing(Soldado::getPuntosDeVida));
        Soldado soldadoMasFuerteEjercito2 = Collections.max(juego.ejercito2, Comparator.comparing(Soldado::getPuntosDeVida));

        System.out.println("Soldado más fuerte del Ejército 1: " + soldadoMasFuerteEjercito1);
        System.out.println("Soldado más fuerte del Ejército 2: " + soldadoMasFuerteEjercito2);

        // Realizar otras operaciones según sea necesario
    }
}
