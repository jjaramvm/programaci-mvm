package com.mycompany.codificaciodeclasses;

public class Media {
    private String nom;
    private String autor;
    private int duradaSegons;

    public Media(String nom, String autor, int duradaSegons) {
        this.nom = nom;
        this.autor = autor;
        this.duradaSegons = duradaSegons;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int duradaSegons) {
        this.duradaSegons = duradaSegons;
    }
    
    public static void main(String[] args) {
        
    }
}
