package com.mycompany.gestioaventurajocderol;

public class GestorElements {
    public static void main(String[] args) {
        // Creem un array per emmagatzemar els elements i no tenir que printar 1 a 1
        Element[] elements = new Element[6];

        // Afegim els elements a l'array
        elements[0] = new Element("Espasa Màgica", "Arma", "Una espasa màgica que incrementa el poder de l'atac", 40);
        elements[1] = new Element("Armadura de Ferro", "Armadura", "Una armadura feta de ferro que proporciona una bona defensa", 25);
        elements[2] = new Element("Poció Curativa", "Poció", "Una poció que restaura punts de vida", 10);
        elements[3] = new Element("Poció de Mana", "Poció", "Una poció que restaura punts de mana", 15);
        elements[4] = new Element("Bala de Plata", "Munició", "Una bala especial feta de plata per enfrontar-se a les criatures de la nit", 5);
        elements[5] = new Element("Capa d'Invisibilitat", "Objecte Màgic", "Una capa que et fa invisible a ulls dels enemics", 30);

        
        System.out.println("Llista d'elements disponibles al joc:\n");
        // Recorrem l'array d'elements i els imprimim
        for (Element element : elements) {
            System.out.println(element);
        }
    }
}
