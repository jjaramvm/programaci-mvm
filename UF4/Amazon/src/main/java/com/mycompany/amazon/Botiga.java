package com.mycompany.amazon;

import java.util.ArrayList;
import java.util.List;

public class Botiga {
    private List<Producte> productes;

    public Botiga() {
        this.productes = new ArrayList<>();
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

    public double calcularPreuTotal() {
        double preuTotal = 0;
        for (Producte producte : productes) {
            preuTotal += producte.calcularPreuFinal();
        }
        return preuTotal;
    }

    public void mostrarDetallsProductes() {
        for (Producte producte : productes) {
            System.out.println(producte.toString());
        }
    }
}
