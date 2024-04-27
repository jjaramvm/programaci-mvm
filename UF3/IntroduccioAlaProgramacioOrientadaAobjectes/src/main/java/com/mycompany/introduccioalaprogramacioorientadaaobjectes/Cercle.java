package com.mycompany.introduccioalaprogramacioorientadaaobjectes;

/**
 *
 * @author Jara
 */
public class Cercle {
    private int radi;
    private int area;
    private int perimetre;

    public Cercle(int radi, int area, int perimetre) {
        this.radi = radi;
        this.area = area;
        this.perimetre = perimetre;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(int perimetre) {
        this.perimetre = perimetre;
    }
    
    
}
