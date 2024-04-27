package com.mycompany.desenvolupamentdeljocpacmanjava;

/**
 *
 * @author jaraj
 */
public class Fantasma {

    private int posX;
    private int posY;
    private String nom;
    private String color;
    private String genere;

    public Fantasma(int posX, int posY, String nom, String color, String genere) {
        this.posX = posX;
        this.posY = posY;
        this.nom = nom;
        this.color = color;
        this.genere = genere;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

}
