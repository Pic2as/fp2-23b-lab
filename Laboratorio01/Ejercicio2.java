//laboratorio Nro 01 - Ejercicio2
//Autor: Llacho Delgado Samir Jaren
import java.util.*;
public class Ejercicio2 {
    public static void main  (String[]args) {
        Scanner sc = new Scanner(System.in);
        String soldado = "", lista = "", vida = "";
        for(int i = 1; i <= 5; i++){
            System.out.println("ingrese nombre de soldado " + i);
            soldado = sc.next();
            lista += "soldado" + i + " : ";
            lista += soldado;
            lista += "   ";
            System.out.println("ingrese nivel de vida: (0 - 5)");
            vida = sc.next();
            lista += "nivel de vida: ";
            lista += vida;
            lista += " \n";
        }
        System.out.println("Soldados listos:\n" + lista);
    }
}