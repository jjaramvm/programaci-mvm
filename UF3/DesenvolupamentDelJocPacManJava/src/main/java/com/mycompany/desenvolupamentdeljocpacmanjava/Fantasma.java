package com.mycompany.desenvolupamentdeljocpacmanjava;

/**
 *
 * @author jaraj
 */
public class Fantasma {

    private int posX;
    private int posY;
    private String nom;

    public Fantasma(int posX, int posY, String nom) {
        this.posX = posX;
        this.posY = posY;
        this.nom = nom;
    }

    public void move(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
