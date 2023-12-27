//laboratorio Nro 01 - Ejercicio4
//Autor: Llacho Delgado Samir Jaren 
import java.util.*;
public class Ejercicio4 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        String[] soldados = new String[5];
        for(int i = 0; i < soldados.length; i++){
            System.out.println("Ingrese nombre de soldado ");
            soldados[i] = sc.next();
        } 
        String[] vida = new String[5];
        for(int i = 0; i < vida.length; i++){
            System.out.println("Ingrese nivel de vida: (0-5)");
            vida[i] = sc.next();
        }
        for(int y = 0; y < 5; y++){
            System.out.println("soldado " + y + " : " + soldados[y] + " nvl. de vida: " + vida[y]);
        }
    }
}
