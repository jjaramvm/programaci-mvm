package com.mycompany.minipracticadeprogramacio;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        System.out.println("""
                           Que vols fer:
                            1. Afegir nous llibres.
                            2. Recuperar la llista de llibres.
                            3. Actualitzar la informació d'un llibre existent. 
                            4. Eliminar un llibre.""");

        String opcio = sc.nextLine();
        switch (opcio) {
            case "1" -> {
                // Crear un nou llibre
                Book book = new Book(1, "El Instituto", "Stephen King", "Planeta",500);
                dbManager.addBook(book);
            }
            case "2" -> {
                // Recuperar llibre
                Book retrievedBook = dbManager.getBook(1);
                System.out.println(retrievedBook);
            }
            case "3" -> {
                Book book;
                // Actualitzar llibre
                book.setAuthor("Jose Revilla");
                book.setStock(200);
                dbManager.updateBook(book);
            }
            case "4" -> // Eliminar llibre
                dbManager.deleteBook(1);
        }

        dbManager.disconnect();

    }
}
