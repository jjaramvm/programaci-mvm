package com.mycompany.amazon;

import java.time.LocalDate;

public class MainApp {

    public static void main(String[] args) {
        Botiga botiga = new Botiga();

        // Afegim alguns productes a la botiga
        Aliment aliment = new Aliment(1, "Pa", 2.5);
        aliment.setDataCaducitat(LocalDate.of(2024, 5, 15));
        botiga.afegirProducte(aliment);

        Electrodomestic electrodomestic = new Electrodomestic(2, "Televisor", 500);
        electrodomestic.setMesosGarantia(12);
        botiga.afegirProducte(electrodomestic);

        Llibre llibre = new Llibre(3, "El Senyor dels Anells", 20);
        llibre.setAutor("J.R.R. Tolkien");
        llibre.setNumPagines(1000);
        botiga.afegirProducte(llibre);

        // Mostrem els detalls dels productes i calculem el preu total
        botiga.mostrarDetallsProductes();
        System.out.println("Preu total: " + botiga.calcularPreuTotal());
    }
}
