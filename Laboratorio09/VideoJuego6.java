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
        
       
        ubicarEjercito(tablero,ejercitoA, idA);
        ubicarEjercito(tablero,ejercitoB, idB); 
        mostrarTablero(tablero);
        for (int i = 0; i < ejercitoB.length; i++) {
            System.out.println(ejercitoB[i]);
        }
        //mostrarListaSoldados(ejercitoB);
        //mostrarListaSoldados(ejercitoA);
    }
    public static Soldado[] crearSoldados(int n, String id){
        Random random = new Random();
        Soldado[] ejercito = new Soldado[n];
    
        for (int i = 0; i < n; i++) {
            String nombre    = "Soldado " + (i + 1) + id;
            int nivelAtaque  = random.nextInt(5) + 1;
            int nivelDefensa = random.nextInt(5) + 1;
            int nivelVida    = random.nextInt(5) + 1;
            int vidaActual   = nivelVida;
            int velocidad    = random.nextInt(5) + 1;
            String actitud   = "Neutral";
            boolean vive     = true;
    
            ejercito[i] = new Soldado(nombre, nivelAtaque, nivelDefensa, nivelVida, vidaActual, velocidad, actitud, vive);
            System.out.println(nombre);
            System.out.println(nivelAtaque);
            System.out.println(nivelDefensa);
            System.out.println(nivelVida);
            System.out.println(velocidad);
            System.out.println(actitud);
            System.out.println(vive);

        }
        return ejercito;
    }
    

    // Método para ubicar un ejército en el tablero con la letra correspondiente
    public static void ubicarEjercito(String[][] tablero, Soldado[] soldados, String id) {
        Random random = new Random();

        for (int i = 0; i < soldados.length; i++) {
            String name = i + id; 
            int filaSoldado = random.nextInt(tablero.length);
            int columnaSoldado = random.nextInt(tablero[0].length);

            // Verificar que la posición esté vacía antes de colocar al soldado
            while (!tablero[filaSoldado][columnaSoldado].equals("--")) {
                filaSoldado = random.nextInt(tablero.length);
                columnaSoldado = random.nextInt(tablero[0].length);
            }

            tablero[filaSoldado][columnaSoldado] = name;
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
        for (int i = 0; i < ejercito.length; i++) {
             // Concatenar el nombre del soldado con su identificador
            System.out.println(ejercito[i]);
        }
    }    
}