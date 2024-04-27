package com.mycompany.desenvolupamentdeljocpacmanjava;

/**
 *
 * @author jaraj
 */
public class MainApp {

    public static void main(String[] args) {
        Fantasma[] fantasmas = {
            new Fantasma(0,0,"Pinky"),
            new Fantasma(1,0,"Inky"),
            new Fantasma(2,0,"Blinky"),
            new Fantasma(3,0,"Clyde")
        };

        System.out.println("Aquests són els fantasmes que volen lluitar contra Pac-Man:\n");
        for (int i = 0; i < fantasmas.length; i++) {
            System.out.println("Fantasma " + (i+1) + ": " + fantasmas[i].getNom());
        }
        
        // Al principi vaig declarar cada fantasma per separat pero he provat a crear una array de objectes, recorrent amb un for i ho fa més simple i per després, més fàcil de modificar.
    }
}
