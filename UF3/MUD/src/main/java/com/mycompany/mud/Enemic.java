package com.mycompany.mud;

public class Enemic {

    private int id;
    private String nom;
    private int força;
    private int destresa;
    private int saviesa;
    private String tipus;
    private int nvlLluita;
    private int recompensaExp;
    private String localitzacio;

    public Enemic(int id, String nom, int força, int destresa, int saviesa, String tipus, int nvlLluita, int recompensaExp, String localitzacio) {
        this.id = id;
        this.nom = nom;
        this.força = força;
        this.destresa = destresa;
        this.saviesa = saviesa;
        this.tipus = tipus;
        this.nvlLluita = nvlLluita;
        this.recompensaExp = recompensaExp;
        this.localitzacio = localitzacio;
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

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getNvlLluita() {
        return nvlLluita;
    }

    public void setNvlLluita(int nvlLluita) {
        this.nvlLluita = nvlLluita;
    }

    public int getRecompensaExp() {
        return recompensaExp;
    }

    public void setRecompensaExp(int recompensaExp) {
        this.recompensaExp = recompensaExp;
    }

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

}
