package com.mycompany.codificaciodeclasses;

/**
 *
 * @author Jara
 */
public class MediaApp{
    public static void main(String[]args){
        Media media1 = new Media("ambysvspanzasdemoniacas","AmbysTeam",1200);
        Media media2 = new Media("Anyone but You","Will Gluck",6180);
        Media media3 = new Media("Damsel","Juan Carlos Fresnadillo", 6600);
        
        System.out.println("Top 3 vídeos de la semana:\nTop1: "+media1.getNom()+" "+media1.getAutor()+" "+media1.getDuradaSegons()+"\nTop2: "+media2.getNom()+" "+media2.getAutor()+" "+media2.getDuradaSegons()+"\nTop3: "+media3.getNom()+" "+media3.getAutor()+" "+media3.getDuradaSegons());
    }
    
}
