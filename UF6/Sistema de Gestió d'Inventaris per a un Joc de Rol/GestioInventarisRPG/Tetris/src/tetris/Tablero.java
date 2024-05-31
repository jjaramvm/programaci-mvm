package tetris;

public class Tablero {

    private int Alto;
    private int Ancho;

    public Tablero(int Alto, int Ancho) {
        this.Alto = Alto;
        this.Ancho = Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

}
