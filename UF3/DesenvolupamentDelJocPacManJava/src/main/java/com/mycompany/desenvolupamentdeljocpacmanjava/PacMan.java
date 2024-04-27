package com.mycompany.desenvolupamentdeljocpacmanjava;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jaraj
 */
public class PacMan {

    private int posX;
    private int posY;
    private int vides;
    private int puntuacio;
    private boolean invencible;

    public PacMan(int posX, int posY, int vides, int puntuacio, boolean invencible) {
        this.posX = posX;
        this.posY = posY;
        this.vides = 3;
        this.puntuacio = 0;
        this.invencible = false;
    }

    public void move(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
    }

    public void pickupBola() {
        this.puntuacio += 10; // Incrementar la puntuació per recollir una bola
    }

    public void pickupBolaEspecial() {
        // Invencibilitat temporal activada
        this.invencible = true;

        // Temporitzador per desactivar la invencibilitat
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                invencible = false; // Desactivar la invencibilitat després de 10 segons
            }
        }, 10000); // 10000 mil·lisegons = 10 segons
    }

    public boolean isInvencible() {
        return invencible;
    }

    public void pickupFruita() {
        this.puntuacio += 100; // Incrementar la puntuació per recollir una fruita
    }

    public void loseLife() {
        this.vides--; // Perdre una vida quan Pac-Man és capturat per un fantasma
    }

    public boolean detectColisionFantasma(Fantasma[] fantasmas) {
        for (Fantasma fantasma : fantasmas) {
            if (this.posX == fantasma.getPosX() && this.posY == fantasma.getPosY()) {
                return true; // Si hi ha col·lisió amb algun fantasma, retorna true
            }
        }
        return false; // Si no hi ha col·lisió amb cap fantasma, retorna false
    }
}
