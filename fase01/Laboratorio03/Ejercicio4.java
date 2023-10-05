//laboratorio Nro 03 - Ejercicio4
//Autor: Llacho Delgado Samir Jaren 
import java.util.*;
class Soldado {
    private String nombre;
    private int nivelVida;

    public Soldado(String nombre, int nivelVida) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soldado[] soldados = new Soldado[5];

        for (int i = 0; i < soldados.length; i++) {
            System.out.println("Ingrese nombre de soldado: ");
            String nombre = sc.next();
            System.out.println("Ingrese nivel de vida (0-5): ");
            int nivelVida = sc.nextInt();
            soldados[i] = new Soldado(nombre, nivelVida);
        }

        for (int y = 0; y < 5; y++) {
            Soldado soldado = soldados[y];
            System.out.println("Soldado " + y + ": " + soldado.getNombre() + " Nivel de vida: " + soldado.getNivelVida());
        }
    }
}

