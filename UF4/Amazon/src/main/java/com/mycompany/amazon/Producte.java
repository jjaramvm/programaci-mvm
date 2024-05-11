package com.mycompany.amazon;

public abstract class Producte {
    private int Codi;
    private String Nom;
    double Preu;

    public Producte(int Codi, String Nom, double Preu) {
        this.Codi = Codi;
        this.Nom = Nom;
        this.Preu = Preu;
    }
    
    public int getCodi() {
        return Codi;
    }

    public void setCodi(int Codi) {
        this.Codi = Codi;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getPreu() {
        return Preu;
    }

    public void setPreu(double Preu) {
        this.Preu = Preu;
    }
    
    public abstract double calcularPreuFinal();

    @Override
    public String toString() {
        return "Codi: " + Codi + ", Nom: " + Nom + ", Preu: " + Preu;
    }
    
    
}
