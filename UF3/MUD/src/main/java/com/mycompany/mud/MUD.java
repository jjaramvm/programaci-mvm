package com.mycompany.mud;

public class MUD {

    public static void main(String[] args) {
        Jugador[] jugadors = {
            new Jugador(1, "Gorath el Implacable", 25, 15, 10, "Barbari", 7, "Espasa de la Tempesta"),
            new Jugador(2, "Lyra la Valenta", 20, 20, 12, "Paladí", 8, "Escut Sagrat"),
            new Jugador(3, "Tharin el Destrossador", 30, 10, 8, "Guerre", 6, "Martell de Guerra"),
            new Jugador(4, "Elena la Temeraria", 18, 25, 15, "Assassí", 9, "Dagues Venenosas")
        };

        System.out.println("Aquests són els herois de Ultimate Dungeons:\n");
        for (int i = 0; i < jugadors.length; i++) {
            Jugador jugador = jugadors[i];
            System.out.println("Heroi " + (i + 1) + ": " + jugador.getNom() +
                               ", Força: " + jugador.getForça() +
                               ", Professió: " + jugador.getProfessio() +
                               ", Nivell de Lluita: " + jugador.getNvlLluita());
        }

        Enemic[] enemics = {
            new Enemic(1, "Goblin", 10, 8, 5, "Bèstia", 3, 50, "Bosc Encantat"),
            new Enemic(2, "Esquelet", 12, 6, 7, "No Mort", 4, 75, "Torre de la Bruixa"),
            new Enemic(3, "Drac de Foc", 20, 15, 12, "Dragó", 8, 500, "Cova Profunda"),
            new Enemic(4, "Bruixa Malvada", 18, 20, 15, "Màgic", 10, 1000, "Castell Negre")
        };

        System.out.println("\nAquests són els enemics de Ultimate Dungeons:\n");
        for (int i = 0; i < enemics.length; i++) {
            Enemic enemic = enemics[i];
            System.out.println("Monstre " + (i + 1) + ": " + enemic.getNom() +
                               ", Força: " + enemic.getForça() +
                               ", Tipus: " + enemic.getTipus() +
                               ", Nivell de Lluita: " + enemic.getNvlLluita() +
                               ", Localització: " + enemic.getLocalitzacio());
        }

        Objecte[] objectes = {
            new Objecte(1, "Espasa Llaminera", "Una espasa llarga amb incrustacions de diamants.", "Arma", "Augmenta el dany infligit."),
            new Objecte(2, "Armadura de l'Ànima", "Una armadura que augmenta la resistència del seu portador.", "Armadura", "Redueix el dany rebut."),
            new Objecte(3, "Amulet de la Protecció", "Un amulet que proporciona protecció contra malediccions.", "Accessor", "Augmenta la resistència a malediccions."),
            new Objecte(4, "Poció d'Invulnerabilitat", "Una poció que fa el seu consumidor invulnerable durant un temps limitat.", "Poció", "Concedeix invulnerabilitat temporal."),
            new Objecte(5, "Espasa del Caçador de Dracs", "Una espasa lleugera amb una punta afilada.", "Arma", "Augmenta el dany contra dracs."),
            new Objecte(6, "El Gran Escut de la Llum", "Un escut resistent fet amb runes sagrades.", "Armadura", "Augmenta la resistència contra atacs màgics."),
            new Objecte(7, "El Collaret de la Percepció", "Un collaret que millora la capacitat de percepció del seu portador.", "Accessor", "Augmenta la capacitat de detecció de trampes."),
            new Objecte(8, "Elixir de la Vida Eterna", "Una poció que restaura la salut del seu consumidor al màxim.", "Poció", "Recupera tota la salut i cura efectes negatius.")
        };

        System.out.println("\nAquests són els objectes de Ultimate Dungeons:\n");
        for (int i = 0; i < objectes.length; i++) {
            Objecte objecte = objectes[i];
            System.out.println("Objecte " + (i + 1) + ": " + objecte.getNom() +
                               ", Tipus: " + objecte.getTipus() +
                               ", Descripció: " + objecte.getDescripcio());
        }

        Mapa[] mapes = {
            new Mapa(1, "Bosc Encantat", "Un bosc dens amb arbres màgics.", "Goblin, Troll", "Espasa enfosquida, Poció de Força", 3),
            new Mapa(2, "Torre de la Bruixa", "Una torre fosca amb moltes escales.", "Bruixa, Esquelet", "Llibre d'Encanteris, Poció de Vida", 5),
            new Mapa(3, "Cova Profunda", "Una caverna fosca habitada per dracs.", "Drac de Foc, Drac de Gela", "Martell de Guerra, Escut Protector", 7),
            new Mapa(4, "Castell Negre", "Una fortalesa misteriosa dominada per temibles vampirs.", "Vampir, Llop", "Amulet Protector, Dagues Venenosas", 10)
        };

        System.out.println("\nAquests són els mapes de Ultimate Dungeons:\n");
        for (int i = 0; i < mapes.length; i++) {
            Mapa mapa = mapes[i];
            System.out.println("Món " + (i + 1) + ": " + mapa.getNom() +
                               ", Nivell Mínim: " + mapa.getNvlMinim() +
                               ", Descripció: " + mapa.getDescripcio());
        }

    }

}
