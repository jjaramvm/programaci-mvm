package tetris;

public class Nivel {

    private int Nivel;
    private int Velocidad;

    public Nivel(int Nivel, int Velocidad) {
        this.Nivel = Nivel;
        this.Velocidad = Velocidad;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    int aumentarVelocidad() {
        int velocidad = +1;
        return velocidad;
    }

}
