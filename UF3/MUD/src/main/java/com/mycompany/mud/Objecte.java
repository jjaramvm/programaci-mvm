/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mud;

/**
 *
 * @author jaraj
 */
public class Objecte {
    private int id;
    private String nom;
    private String descripcio;
    private String tipus;
    private String efectes;

    public Objecte(int id, String nom, String descripcio, String tipus, String efectes) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.tipus = tipus;
        this.efectes = efectes;
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

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEfectes() {
        return efectes;
    }

    public void setEfectes(String efectes) {
        this.efectes = efectes;
    }
    
    
}
