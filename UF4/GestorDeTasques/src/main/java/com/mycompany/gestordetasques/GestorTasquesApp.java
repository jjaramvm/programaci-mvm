package com.mycompany.gestordetasques;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestorTasquesApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el nom del fitxer de tasques:");
        String nomFitxer = scanner.nextLine();
        GestorTasques gestorTasques = new GestorTasques(nomFitxer);

        while (true) {
            System.out.println("Selecciona una opció:");
            System.out.println("1. Afegir una nova tasca");
            System.out.println("2. Modificar una tasca existent");
            System.out.println("3. Eliminar una tasca existent");
            System.out.println("4. Visualitzar la llista de tasques");
            System.out.println("5. Sortir");

            int opcio = Integer.parseInt(scanner.nextLine());
            switch (opcio) {
                case 1:
                    afegirTasca(gestorTasques, scanner);
                    break;
                case 2:
                    modificarTasca(gestorTasques, scanner);
                    break;
                case 3:
                    borrarTasca(gestorTasques, scanner);
                    break;
                case 4:
                    veureTasques(gestorTasques);
                    break;
                case 5:
                    System.out.println("Sortint del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opció no vàlida.");
            }
        }
    }

    private static void afegirTasca(GestorTasques gestorTasques, Scanner scanner) {
        try {
            System.out.println("Introdueix el títol de la tasca:");
            String titol = scanner.nextLine();
            System.out.println("Introdueix la descripcio de la tasca:");
            String descripcio = scanner.nextLine();
            System.out.println("Introdueix la data de venciment (dd/MM/yyyy):");
            String dataVencimentString = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataVenciment = dateFormat.parse(dataVencimentString);
            System.out.println("Introdueix l'estat de la tasca (pendent, en curs, completada):");
            String estat = scanner.nextLine();
            Tasca tasca = new Tasca(titol, descripcio, dataVenciment, estat);
            gestorTasques.afegirTasca(tasca);
            System.out.println("Tasca afegida correctament.");
        } catch (Exception e) {
            System.out.println("Error afegint la tasca. Si us plau, revisa les dades introduïdes.");
        }
    }

    private static void modificarTasca(GestorTasques gestorTasques, Scanner scanner) {
        try {
            System.out.println("Introdueix el número de la tasca a modificar:");
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Introdueix el nou títol de la tasca:");
            String titol = scanner.nextLine();
            System.out.println("Introdueix la nova descripció de la tasca:");
            String descripcio = scanner.nextLine();
            System.out.println("Introdueix la nova data de venciment (dd/MM/yyyy):");
            String dataVencimentString = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataVenciment = dateFormat.parse(dataVencimentString);
            System.out.println("Introdueix el nou estat de la tasca (pendent, en curs, completada):");
            String estat = scanner.nextLine();
            Tasca tasca = new Tasca(titol, descripcio, dataVenciment, estat);
            gestorTasques.modificarTasca(index, tasca);
            System.out.println("Tasca modificada correctament.");
        } catch (Exception e) {
            System.out.println("Error modificant la tasca. Si us plau, revisa les dades introduïdes.");
        }
    }

    private static void borrarTasca(GestorTasques gestorTasques, Scanner scanner) {
        try {
            System.out.println("Introdueix el número de la tasca a eliminar:");
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            gestorTasques.borrarTasca(index);
            System.out.println("Tasca eliminada correctament.");
        } catch (Exception e) {
            System.out.println("Error eliminant la tasca. Si us plau, revisa les dades introduïdes.");
        }
    }

    private static void veureTasques(GestorTasques gestorTasques) {
        int i = 1;
        for (Tasca tasca : gestorTasques.getTasques()) {
            System.out.println(i + ". " + tasca);
            i++;
        }
    }
}
