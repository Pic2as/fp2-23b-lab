import java.util.*;
public class VideoJuego3{
    public static void main(String[]args){
        int n = 10; // Número de soldados por ejército
        ArrayList<ArrayList<Soldado>> tablero = new ArrayList<>();
        ArrayList<Soldado> ejercito1 = new ArrayList<>();
        ArrayList<Soldado> ejercito2 = new ArrayList<>();
        inicializarTablero(tablero, ejercito1, ejercito2, n);
    }
    
    private static void inicializarTablero(ArrayList<ArrayList<Soldado>> tablero, ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2, int n) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            tablero.add(new ArrayList<>());
        }

        for (int i = 0; i < 10; i++) {
            // Crear soldado para el ejército 1
            Soldado soldado1 = crearSoldado(i, 1, random, tablero);
            ejercito1.add(soldado1);

            // Crear soldado para el ejército 2
            Soldado soldado2 = crearSoldado(i, 2, random, tablero);
            ejercito2.add(soldado2);
        }
    }
    private static Soldado crearSoldado(int index, int ejercito, Random random, ArrayList<ArrayList<Soldado>> tablero) {
        String nombre = "Soldado" + index + "X" + ejercito;
        int puntosVida = random.nextInt(5) + 1;
        int fila, columna;

        do {
            fila = random.nextInt(10);
            columna = random.nextInt(10);
        } while (yaOcupado(tablero, fila, columna));

        Soldado soldado = new Soldado(nombre, puntosVida, fila, columna);
        tablero.get(fila).add(soldado);

        return soldado;
    }
    private static boolean yaOcupado(ArrayList<ArrayList<Soldado>> tablero, int fila, int columna) {
        return !tablero.get(fila).isEmpty() && tablero.get(fila).get(tablero.get(fila).size() - 1).getColumna() == columna;
    }
}
    
