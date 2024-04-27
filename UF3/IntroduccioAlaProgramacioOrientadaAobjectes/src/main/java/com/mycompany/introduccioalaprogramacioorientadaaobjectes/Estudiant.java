package com.mycompany.introduccioalaprogramacioorientadaaobjectes;

/**
 *
 * @author Jara
 */
public class Estudiant {
    private String nom;
    private int edat;
    private String curs;

    public Estudiant(String nom, int edat, String curs) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }
    
}
