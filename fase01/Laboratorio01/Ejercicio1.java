//laboratorio Nro 01 - Ejercicio1
//Autor: Llacho Delgado Samir Jaren
import java.util.*;
public class Ejercicio1 {
    public static void main  (String[]args) {
        Scanner sc = new Scanner(System.in);
        String soldado = "", lista = "";
        for(int i = 1; i <= 5; i++){
            System.out.println("ingrese nombre de soldado " + i);
            soldado = sc.next();
            soldado += " ";
            lista += soldado;
        }
        System.out.println("Soldados listos:\n" + lista);
    }
}
