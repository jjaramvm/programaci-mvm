package tetris;

public class Partida {

    private int Nivel;
    private int Puntuacion;
    private int puntuacionMaxima;
    private int Tiempo;

    public Partida(int Nivel, int Puntuacion, int puntuacionMaxima, int Tiempo) {
        this.Nivel = Nivel;
        this.Puntuacion = Puntuacion;
        this.puntuacionMaxima = puntuacionMaxima;
        this.Tiempo = Tiempo;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(int puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

}
