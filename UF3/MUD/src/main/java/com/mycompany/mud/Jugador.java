package com.mycompany.mud;

public class Jugador {

    private int id;
    private String nom;
    private int força;
    private int destresa;
    private int saviesa;
    private String professio;
    private int nvlLluita;
    private String inventari;

    public Jugador(int id, String nom, int força, int destresa, int saviesa, String professio, int nvlLluita, String inventari) {
        this.id = id;
        this.nom = nom;
        this.força = força;
        this.destresa = destresa;
        this.saviesa = saviesa;
        this.professio = professio;
        this.nvlLluita = nvlLluita;
        this.inventari = inventari;
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

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getDestresa() {
        return destresa;
    }

    public void setDestresa(int destresa) {
        this.destresa = destresa;
    }

    public int getSaviesa() {
        return saviesa;
    }

    public void setSaviesa(int saviesa) {
        this.saviesa = saviesa;
    }

    public String getProfessio() {
        return professio;
    }

    public void setProfessio(String professio) {
        this.professio = professio;
    }

    public int getNvlLluita() {
        return nvlLluita;
    }

    public void setNvlLluita(int nvlLluita) {
        this.nvlLluita = nvlLluita;
    }

    public String getInventari() {
        return inventari;
    }

    public void setInventari(String inventari) {
        this.inventari = inventari;
    }

}
