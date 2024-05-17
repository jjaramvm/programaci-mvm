package com.mycompany.gestordetasques;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasca {
    private String titol;
    private String descripcio;
    private Date dataVenciment;
    private String estat;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Tasca(String titol, String descripcio, Date dataVenciment, String estat) {
        this.titol = titol;
        this.descripcio = descripcio;
        this.dataVenciment = dataVenciment;
        this.estat = estat;
    }

    public static Tasca fromString(String str) {
        try {
            String[] parts = str.split(",");
            if (parts.length != 4) {
                return null;
            }
            String titol = parts[0];
            String descripcio = parts[1];
            Date dataVenciment = dateFormat.parse(parts[2]);
            String estat = parts[3];
            return new Tasca(titol, descripcio, dataVenciment, estat);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return titol + "," + descripcio + "," + dateFormat.format(dataVenciment) + "," + estat;
    }

    // Getters i setters (opcionals, segons les teves necessitats)
}
