package com.mycompany.empleats;

public class MainApp {

    public static void main(String[] args) {
        Empleat empleat1 = new Empleat("Albert", 2000.0);
        EmpleatPerHores empleat2 = new EmpleatPerHores("Maria", 40, 40, 0);
        EmpleatAsalariat empleat3 = new EmpleatAsalariat("Jose Antonio",1500);
        EmpleatPerComisio empleat4 = new EmpleatPerComisio("Aitor", 500, 14, 25);

        // Calcular salaris
        double salariEmpleat1 = empleat1.getSalari();
        double salariEmpleat2 = empleat2.calcularSalari();
        double salariEmpleat4 = empleat4.calcularSalari();

        // Detalls empleats
        System.out.println("Detalls de l'empleat 1:");
        empleat1.imprimirDetalls();
        System.out.println("Salari: " + salariEmpleat1);

        System.out.println();

        System.out.println("Detalls de l'empleat 2:");
        empleat2.imprimirDetalls();
        System.out.println("Salari: " + salariEmpleat2);
        
        System.out.println();

        System.out.println("Detalls de l'empleat 3:");
        empleat3.imprimirDetalls();
        
        
        System.out.println();

        System.out.println("Detalls de l'empleat 4:");
        empleat4.imprimirDetalls();
        System.out.println("Salari: " + salariEmpleat4);
    }
}
