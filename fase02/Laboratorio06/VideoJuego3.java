import java.util.*;
public class VideoJuego3{
    public static void main(String[]args){
        int n = 10; // Número de soldados por ejército
        ArrayList<ArrayList<Soldado>> tablero = new ArrayList<>();
        ArrayList<Soldado> ejercito1 = new ArrayList<>();
        ArrayList<Soldado> ejercito2 = new ArrayList<>();

        inicializarTablero(tablero, ejercito1, ejercito2, n);
        
        imprimirTablero(tablero);
        imprimirDatosSoldados(ejercito1, ejercito2);
        imprimirRankingDePoder(ejercito1, ejercito2);
        imprimirSoldadoConMayorVida(ejercito1, ejercito2);
    }

    private static void inicializarTablero(ArrayList<ArrayList<Soldado>> tablero, ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2, int n) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            tablero.add(new ArrayList<>());
        }

        for (int i = 0; i < 10; i++) {
            // Crear soldado para el ejército 1
            Soldado soldado1 = crearSoldados(i, 1, random, tablero);
            ejercito1.add(soldado1);

            // Crear soldado para el ejército 2
            Soldado soldado2 = crearSoldados(i, 2, random, tablero);
            ejercito2.add(soldado2);
        }
    }
    private static void imprimirTablero(ArrayList<ArrayList<Soldado>> tablero) {
        for (int i = 0; i < tablero.size(); i++) {
            for (Soldado soldado : tablero.get(i)) {
                System.out.print(soldado.getNombre() + " | ");
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
        }
        System.out.println();
    }
    private static Soldado crearSoldados(int index, int ejercito, Random random, ArrayList<ArrayList<Soldado>> tablero) {
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

    private static void imprimirDatosSoldados(ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2) {
        System.out.println("Datos de los soldados del Ejército 1:");
        for (Soldado soldado : ejercito1) {
            System.out.println(soldado.getNombre() + " - Puntos de Vida: " + soldado.getPuntosVida());
        }
        System.out.println();
        System.out.println("Datos de los soldados del Ejército 2:");
        for (Soldado soldado : ejercito2) {
            System.out.println(soldado.getNombre() + " - Puntos de Vida: " + soldado.getPuntosVida());
        }
        System.out.println();
    }
    private static void imprimirRankingDePoder(ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2) {
        // Ordenar soldados por puntos de vida de forma ascendente (menor a mayor)
        Collections.sort(ejercito1, (s1, s2) -> Integer.compare(s1.getPuntosVida(), s2.getPuntosVida()));
        Collections.sort(ejercito2, (s1, s2) -> Integer.compare(s1.getPuntosVida(), s2.getPuntosVida()));

        System.out.println("Ranking de poder del Ejército 1 (menor a mayor):");
        for (Soldado soldado : ejercito1) {
            System.out.println(soldado.getNombre() + " - Puntos de Vida: " + soldado.getPuntosVida());
        }

        System.out.println();

        System.out.println("Ranking de poder del Ejército 2 (menor a mayor):");
        for (Soldado soldado : ejercito2) {
            System.out.println(soldado.getNombre() + " - Puntos de Vida: " + soldado.getPuntosVida());
        }
        System.out.println();
    }
    private static void imprimirSoldadoConMayorVida(ArrayList<Soldado> ejercito1, ArrayList<Soldado> ejercito2) {
        Soldado maxVidaEjercito1 = Collections.max(ejercito1, (s1, s2) -> Integer.compare(s1.getPuntosVida(), s2.getPuntosVida()));
        Soldado maxVidaEjercito2 = Collections.max(ejercito2, (s1, s2) -> Integer.compare(s1.getPuntosVida(), s2.getPuntosVida()));

        System.out.println("Soldado con mayor vida del Ejército 1: " + maxVidaEjercito1.getNombre() + " - Puntos de Vida: " + maxVidaEjercito1.getPuntosVida());
        System.out.println("Soldado con mayor vida del Ejército 2: " + maxVidaEjercito2.getNombre() + " - Puntos de Vida: " + maxVidaEjercito2.getPuntosVida());
        if (maxVidaEjercito1.getPuntosVida() > maxVidaEjercito2.getPuntosVida()) {
            System.out.println(" > El Ejército 1 ganaria por tener un soldado con mayor vida.\n");
        } else if (maxVidaEjercito1.getPuntosVida() < maxVidaEjercito2.getPuntosVida()) {
            System.out.println(" > El Ejército 2 ganaria por tener un soldado con mayor vida.\n");
        } else {
            System.out.println(" > Ambos ejércitos tienen un soldado con la misma vida máxima.\n");
        }
    }
}
    
