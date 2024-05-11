package com.mycompany.amazon;

public class Llibre extends Producte {
    
    private String autor;
    private int numPagines;

    public Llibre(int Codi, String Nom, double Preu) {
        super(Codi, Nom, Preu);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }

    @Override
    public double calcularPreuFinal() {
        // Aquí pots implementar la lògica per aplicar descomptes o recàrrecs segons el nombre de pàgines
        return Preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Número de pàgines: " + numPagines;
    }
}
