package com.mycompany.implementacioarbrebinarienjava;

public class MainApp {

    public static void main(String[] args) {
        // A. Crear 2 Arbres d’enters de fondaria 5.
        ArbreEnters intArbre1 = new ArbreEnters(5);
        ArbreEnters intArbre2 = new ArbreEnters(5);

        // B. Mostrar quantes instàncies existeixen d‘arbres.
        System.out.println("Total instàncies dels arbres: " + ArbreEnters.getTotalInstancies());

        // C. Crear 2 Arbres de caràcters de fondaria 3.
        ArbreCaracters arbre1 = new ArbreCaracters(3);
        ArbreCaracters arbre2 = new ArbreCaracters(3);

        // D. Mostrar quantes instàncies existeixen d’arbres.
        System.out.println("Total instàncies dels arbres: " + ArbreEnters.getTotalInstancies());

        // E. Forçar al Garbage Collector.
        System.gc();

        // F. Recórrer el primer arbre d’enters mostrant els valors per pantalla, fent servir només les branques dretes.
        System.out.println("Recorre l'arbre d'enters 1 fent servir només les branques dretes:");
        intArbre1.recorreBranquesDretes();

        // G. Recórrer el segon arbre d’enters mostrant els valors per pantalla, fent servir només les branques esquerres.
        System.out.println("Recorre l'arbre d'enters 2 fent servir només les branques esquerres:");
        intArbre2.recorreBranquesEsquerres();

        // H. Tornar a mostrar quantes instàncies existeixen.
        System.out.println("Total instàncies dels arbres: " + ArbreEnters.getTotalInstancies());

        // I. Tornar a forçar al Garbage Collector.
        System.gc();

        // J. Tornar a mostrar quantes instàncies existeixen.
        System.out.println("Total instàncies dels arbres: " + ArbreEnters.getTotalInstancies());
    }

}
