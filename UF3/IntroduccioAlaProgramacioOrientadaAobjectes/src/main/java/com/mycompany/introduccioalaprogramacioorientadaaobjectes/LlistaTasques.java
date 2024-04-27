package com.mycompany.introduccioalaprogramacioorientadaaobjectes;

/**
 *
 * @author Jara
 */
public class LlistaTasques {
    private String descripcio;
    private String estat;

    public LlistaTasques(String descripcio, String estat) {
        this.descripcio = descripcio;
        this.estat = estat;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
    
    
}
