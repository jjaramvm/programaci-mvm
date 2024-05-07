package com.mycompany.empleats;

public class Empleat {
    private String nom;
    double salari;

    public Empleat(String nom, double salari) {
        this.nom = nom;
        this.salari = salari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }
    
    public void imprimirDetalls() {
        System.out.println("Nom: " + nom);
        System.out.println("Salari: " + salari);
    }
    
    
    
}
