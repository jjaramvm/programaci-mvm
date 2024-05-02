package com.mycompany.mud;

public class Mapa {

    private int id;
    private String nom;
    private String descripcio;
    private String llistaMonstres;
    private String llistaObjectes;
    private int nvlMinim;

    public Mapa(int id, String nom, String descripcio, String llistaMonstres, String llistaObjectes, int nvlMinim) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.llistaMonstres = llistaMonstres;
        this.llistaObjectes = llistaObjectes;
        this.nvlMinim = nvlMinim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getLlistaMonstres() {
        return llistaMonstres;
    }

    public void setLlistaMonstres(String llistaMonstres) {
        this.llistaMonstres = llistaMonstres;
    }

    public String getLlistaObjectes() {
        return llistaObjectes;
    }

    public void setLlistaObjectes(String llistaObjectes) {
        this.llistaObjectes = llistaObjectes;
    }

    public int getNvlMinim() {
        return nvlMinim;
    }

    public void setNvlMinim(int nvlMinim) {
        this.nvlMinim = nvlMinim;
    }

}
