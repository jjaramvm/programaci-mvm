package com.mycompany.desenvolupamentaplicaciovisualderobots;

import java.io.*;

public class Robot {
    private int x, y;
    private String direccio;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direccio = "Nord";
    }

    public void mouEndavant() {
        switch (direccio) {
            case "Nord":
                y++;
                break;
            case "Sud":
                y--;
                break;
            case "Est":
                x++;
                break;
            case "Oest":
                x--;
                break;
        }
        imprimirEstat();
    }

    public void mouEnrere() {
        switch (direccio) {
            case "Nord":
                y--;
                break;
            case "Sud":
                y++;
                break;
            case "Est":
                x--;
                break;
            case "Oest":
                x++;
                break;
        }
        imprimirEstat();
    }

    public void giraEsquerra() {
        switch (direccio) {
            case "Nord":
                direccio = "Oest";
                break;
            case "Sud":
                direccio = "Est";
                break;
            case "Est":
                direccio = "Nord";
                break;
            case "Oest":
                direccio = "Sud";
                break;
        }
        imprimirEstat();
    }

    public void giraDreta() {
        switch (direccio) {
            case "Nord":
                direccio = "Est";
                break;
            case "Sud":
                direccio = "Oest";
                break;
            case "Est":
                direccio = "Sud";
                break;
            case "Oest":
                direccio = "Nord";
                break;
        }
        imprimirEstat();
    }

    private void imprimirEstat() {
        System.out.println(getEstat());
    }

    public String getEstat() {
        return "Posició: (" + x + ", " + y + "), Direcció: " + direccio;
    }

    public void desaEstat(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(x + "," + y + "," + direccio);
        }
    }

    public void carregaEstat(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String[] estat = reader.readLine().split(",");
            this.x = Integer.parseInt(estat[0]);
            this.y = Integer.parseInt(estat[1]);
            this.direccio = estat[2];
        }
    }
}