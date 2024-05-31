package tetris;

abstract class Pieza {

    private int Id;
    private String Color;
    private String Forma;

    public Pieza(int Id, String Color, String Forma) {
        this.Id = Id;
        this.Color = Color;
        this.Forma = Forma;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getForma() {
        return Forma;
    }

    public void setForma(String Forma) {
        this.Forma = Forma;
    }
    
    

}
