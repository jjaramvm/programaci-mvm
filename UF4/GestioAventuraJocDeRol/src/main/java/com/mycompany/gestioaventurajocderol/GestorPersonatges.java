package com.mycompany.gestioaventurajocderol;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;

public class GestorPersonatges {

    public static void main(String[] args) {
        // Escollim la ruta relativa del XML, si posem només personatges.xml sortirà un error
        String rutaFitxer = "src/main/java/com/mycompany/gestioaventurajocderol/personatges.xml";
        GestorPersonatges gestor = new GestorPersonatges();
        Personatge[] personatges = gestor.carregarPersonatgesDesDeXML(rutaFitxer);
        for (Personatge personatge : personatges) {
            System.out.println(personatge);
        }
    }

    // Mètode per carregar els personatges des d'un fitxer XML
    public Personatge[] carregarPersonatgesDesDeXML(String rutaFitxer) {
        try {
            // Es crea un objecte File a partir de la ruta proporcionada
            File fitxer = new File(rutaFitxer);
            DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = factoria.newDocumentBuilder();
            Document doc = constructor.parse(fitxer);
            doc.getDocumentElement().normalize();

            // Llista de nodes amb l'etiqueta "personatge"
            NodeList nodesPersonatge = doc.getElementsByTagName("personatge");
            // Es crea un array de personatges amb la longitud de la llista de nodes
            Personatge[] personatges = new Personatge[nodesPersonatge.getLength()];

            // Es recorre la llista de nodes "personatge"
            for (int i = 0; i < nodesPersonatge.getLength(); i++) {
                Element elementPersonatge = (Element) nodesPersonatge.item(i);
                // Atributs del personatge de l'element XML
                String nom = elementPersonatge.getElementsByTagName("nom").item(0).getTextContent();
                int nivell = Integer.parseInt(elementPersonatge.getElementsByTagName("nivell").item(0).getTextContent());
                int vida = Integer.parseInt(elementPersonatge.getElementsByTagName("vida").item(0).getTextContent());
                int mana = Integer.parseInt(elementPersonatge.getElementsByTagName("mana").item(0).getTextContent());
                String arma = elementPersonatge.getElementsByTagName("arma").item(0).getTextContent();
                int atac = Integer.parseInt(elementPersonatge.getElementsByTagName("atac").item(0).getTextContent());
                String armadura = elementPersonatge.getElementsByTagName("armadura").item(0).getTextContent();
                int defensa = Integer.parseInt(elementPersonatge.getElementsByTagName("defensa").item(0).getTextContent());

                // Es crea un objecte Personatge amb els atributs obtinguts i s'afegeix a l'array de personatges
                Personatge personatge = new Personatge(nom, nivell, vida, mana, arma, atac, armadura, defensa);
                personatges[i] = personatge;
            }

            // Retorna l'array
            return personatges;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
