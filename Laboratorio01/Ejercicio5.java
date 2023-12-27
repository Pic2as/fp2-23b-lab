//laboratorio Nro 01 - Ejercicio5
//Autor: Llacho Delgado Samir Jaren 
import java.util.*;
public class Ejercicio5 {
    private String[] ejercito1;
    private String[] ejercito2;
    public static void main(String[] args) {
        Ejercicio5 ejercitos = new Ejercicio5();
        ejercitos.inicializarEjercitos();
        ejercitos.mostrarEjercitos();
        ejercitos.mostrarEjercitoGanador();
    }
    public void inicializarEjercitos() {
        Random rand = new Random();
        int numSoldados1 = rand.nextInt(5) + 1;
        int numSoldados2 = rand.nextInt(5) + 1;

        ejercito1 = new String[numSoldados1];
        ejercito2 = new String[numSoldados2];

        for (int i = 0; i < numSoldados1; i++) {
            ejercito1[i] = "Soldado" + i;
        }

        for (int i = 0; i < numSoldados2; i++) {
            ejercito2[i] = "Soldado" + i;
        }
    }
    public void mostrarEjercito(String[] ejercito, String nombreEjercito) {
        System.out.println("Soldados del ejército " + nombreEjercito + ":");
        for (String soldado : ejercito) {
            System.out.println(soldado);
        }
        System.out.println();
    }

    public void mostrarEjercitos() {
        mostrarEjercito(ejercito1, "1");
        mostrarEjercito(ejercito2, "2");
    }

    public void mostrarEjercitoGanador() {
        if (ejercito1.length > ejercito2.length) {
            System.out.println("El ejército 1 es el ganador con " + ejercito1.length + " soldados.");
        } else if (ejercito2.length > ejercito1.length) {
            System.out.println("El ejército 2 es el ganador con " + ejercito2.length + " soldados.");
        } else {
            System.out.println("Ambos ejércitos tienen la misma cantidad de soldados. ¡Es un empate!");
        }
    }
}
