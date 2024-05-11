package com.mycompany.gestioaventurajocderol;

public class Element {

    private String nom;
    private String tipus;
    private String descripcio;
    private int valor;

    public Element(String nom, String tipus, String descripcio, int valor) {
        this.nom = nom;
        this.tipus = tipus;
        this.descripcio = descripcio;
        this.valor = valor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Nom: " + nom + ", Tipus: " + tipus + ", Descripció: " + descripcio + ", Valor: " + valor;
    }

}
