public class Soldado {
    private String nombre;
    private int puntosDeVida;
    private int fila;
    private int columna;

    public Soldado(String nombre, int puntosDeVida, int fila, int columna) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.fila = fila;
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void recibirDanio(int danio) {
        puntosDeVida -= danio;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }
}
