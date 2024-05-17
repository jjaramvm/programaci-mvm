package com.mycompany.gestordetasques;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class GestorTasques {
    private List<Tasca> tasques;
    private String nomFitxer;

    public GestorTasques(String nomFitxer) {
        this.nomFitxer = nomFitxer;
        tasques = new ArrayList<>();
        carregarTasques();
    }

    public void afegirTasca(Tasca tasca) {
        tasques.add(tasca);
        guardarTasques();
    }

    public void modificarTasca(int index, Tasca tasca) {
        if (index >= 0 && index < tasques.size()) {
            tasques.set(index, tasca);
            guardarTasques();
        }
    }

    public void borrarTasca(int index) {
        if (index >= 0 && index < tasques.size()) {
            tasques.remove(index);
            guardarTasques();
        }
    }

    public List<Tasca> getTasques() {
        return tasques;
    }

    private void carregarTasques() {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFitxer))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Tasca tasca = Tasca.fromString(line);
                if (tasca != null) {
                    tasques.add(tasca);
                }
            }
        } catch (FileNotFoundException e) {
            // El fitxer no existeix, no hi ha tasques per carregar
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarTasques() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer))) {
            for (Tasca tasca : tasques) {
                writer.write(tasca.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
