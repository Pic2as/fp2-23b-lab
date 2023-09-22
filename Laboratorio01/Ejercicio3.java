//laboratorio Nro 01 - Ejercicio3
//Autor: Llacho Delgado Samir Jaren 
import java.util.*;
public class Ejercicio3 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String[] soldados = new String[5];
        for(int i = 0; i < soldados.length; i++){
            System.out.println("Ingrese nombre de soldado ");
            soldados[i] = sc.next();
        }
        for(String lista : soldados){
            System.out.println("soldado: "+ lista);
        }
    }
}
