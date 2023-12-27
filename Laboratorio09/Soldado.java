public class Soldado {
    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelVida;
    private int vidaActual;
    private int velocidad;
    private String actitud;
    private boolean vive;

    public Soldado(String nombre, int nivelVida) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
        this.vidaActual = nivelVida;
        this.velocidad = 0;
        this.actitud = "Defensiva";
        this.vive = true;
    }

    public Soldado(String nombre, int nivelAtaque, int nivelDefensa, int nivelVida, int velocidad, String actitud) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelVida = nivelVida;
        this.vidaActual = nivelVida;
        this.velocidad = velocidad;
        this.actitud = actitud;
        this.vive = true;
    }

    public Soldado(String nombre, int nivelAtaque, int nivelDefensa, int nivelVida, int velocidad, String actitud, boolean vive) {
        this(nombre, nivelAtaque, nivelDefensa, nivelVida, velocidad, actitud);
        this.vive = vive;
    }
}