//laboratorio Nro 03 - Ejercicio5
//Autor: Llacho Delgado Samir Jaren 
import java.util.*;
class Soldado {
    private String nombre;
    public Soldado(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
public class Ejercicio5 {
    private Soldado[] ejercito1;
    private Soldado[] ejercito2;
    public void inicializarEjercitos() {
        Random rand = new Random();
        int numSoldados1 = rand.nextInt(5) + 1;
        int numSoldados2 = rand.nextInt(5) + 1;
        ejercito1 = new Soldado[numSoldados1];
        ejercito2 = new Soldado[numSoldados2];
        for (int i = 0; i < numSoldados1; i++) {
            ejercito1[i] = new Soldado("Soldado" + i);
        }
        for (int i = 0; i < numSoldados2; i++) {
            ejercito2[i] = new Soldado("Soldado" + i);
        }
    }

    public void mostrarEjercito(Soldado[] ejercito, String nombreEjercito) {
        System.out.println("Soldados del ejército " + nombreEjercito + ":");
        for (Soldado soldado : ejercito) {
            System.out.println(soldado.getNombre());
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

    public static void main(String[] args) {
        Ejercicio5 ejercitos = new Ejercicio5();
        ejercitos.inicializarEjercitos();
        ejercitos.mostrarEjercitos();
        ejercitos.mostrarEjercitoGanador();
    }
}

