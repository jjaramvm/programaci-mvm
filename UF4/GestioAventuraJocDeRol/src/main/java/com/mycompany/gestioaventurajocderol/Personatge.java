package com.mycompany.gestioaventurajocderol;

public class Personatge {

    private String nom;
    private int nivell;
    private int vida;
    private int mana;
    private String arma;
    private int atac;
    private String armadura;
    private int defensa;

    public Personatge(String nom, int nivell, int vida, int mana, String arma, int atac, String armadura, int defensa) {
        this.nom = nom;
        this.nivell = nivell;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.atac = atac;
        this.armadura = armadura;
        this.defensa = defensa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

}
