import java.util.*;
public class Ahorcado {
    public static void main(String []args){
        String ahor1 = 
        " +---+ \n"+
        " |   | \n" +
        "     | \n" +
        "     | \n" +
        "     | \n" +
        "     | \n" +
        "========= ";
        String ahor2 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        "     | \n"+
        "     | \n"+
        "     | \n"+
        "=========";
        String ahor3 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        " |   | \n"+
        "     | \n"+
        "     | \n"+
        "=========";
        String ahor4 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        "/|   | \n"+
        "     | \n"+
        "     | \n"+
        "=========";
        String ahor5 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        "/|\\  | \n"+
        "     | \n"+
        "     | \n"+
        "=========";
        String ahor6 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        "/|\\  | \n"+
        "/    | \n"+
        "     | \n"+
        "=========";
        String ahor7 = 
        " +---+ \n"+
        " |   | \n"+
        " O   | \n"+
        "/|\\  | \n"+
        "/ \\  | \n"+
        "     | \n"+
        "=========";
        String [] figuras = {ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
        int contador = 1;
        String letra;
        String [] palabras = {"programacion", "java", "identacion", "clases","objetos", "desarrollador", "pruebas"};
        String palSecreta = getPalabraSecreta(palabras);
        StringBuilder palabraOculta = mostrarBlancos(palSecreta);
        
        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.println(figuras[0]);
        mostrarBlancos(palSecreta);
        System.out.println("\n");

        while(contador <= 7) {
            letra = ingreseLetra();
            if (letraEnPalabraSecreta(letra, palSecreta)) {
                mostrarBlancosActualizados(letra, palSecreta, palabraOculta);
                if (palabraOculta.indexOf("_") == -1) {
                    System.out.println("¡Felicidades! ¡Has ganado!");
                    break;
                }
            }
            else {
                System.out.println("Letra incorrecta. Intentos restantes: " + (6 - contador) + "\n");
                System.out.println(figuras[contador]);
                contador++;
            }
            if(contador == 7){
                System.out.println("Game Over\n la palabra era '" + palSecreta + "'.");
                break;
            }
        }
        System.out.println("\n");
    }        
    //COMPLETAR PARA INDICAR SI GANÓ, PERDIÓ Y CUÁNTOS TURNOS NECESITÓ
    public static String getPalabraSecreta(String [] lasPalabras){
        String palSecreta;
        int ind;
        int indiceMayor = lasPalabras.length -1;
        int indiceMenor =0;
        ind = (int) ((Math.random() * (indiceMayor - indiceMenor + 1) + indiceMenor));
        return lasPalabras[ind];
    }
    public static StringBuilder mostrarBlancos(String palabra){
        StringBuilder palabraOculta = new StringBuilder();
        for(int i=0; i < palabra.length(); i++){
            palabraOculta.append("_ ");
        }
        return palabraOculta;
    }
    public static String ingreseLetra(){
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next();
        while(laLetra.length()!= 1) {
            System.out.println("Ingrese solo una letra: "); 
            laLetra = sc.next();
        }
        return laLetra;
    }
    public static boolean letraEnPalabraSecreta(String letra, String palSecreta ){
        return palSecreta.contains(letra);
    }
    public static void mostrarBlancosActualizados(String letra, String palSecreta, StringBuilder palabraOculta){
        boolean letraEncontrada = false;
        for (int i = 0; i < palSecreta.length(); i++) {
            if (palSecreta.charAt(i) == letra.charAt(0)){
                palabraOculta.setCharAt(i * 2, letra.charAt(0));
                letraEncontrada = true;
            }

        }
        System.out.println("PROCESANDO.....");
        if (letraEncontrada) {
            System.out.println("Letra correcta!\n");
        } else {
            System.out.println("Letra incorrecta.\n");
        }
        System.out.println(palabraOculta);
    }
}