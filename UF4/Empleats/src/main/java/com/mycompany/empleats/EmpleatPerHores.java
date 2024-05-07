package com.mycompany.empleats;

public class EmpleatPerHores extends Empleat {

    private int horesTreballades;
    private double tarifaPerHora;

    public EmpleatPerHores(String nom, int horesTreballades, double tarifaPerHora, double salari) {
        super(nom, salari);
        this.horesTreballades = horesTreballades;
        this.tarifaPerHora = tarifaPerHora;
    }

    public int getHoresTreballades() {
        return horesTreballades;
    }

    public void setHoresTreballades(int horesTreballades) {
        this.horesTreballades = horesTreballades;
    }

    public double getTarifaPerHora() {
        return tarifaPerHora;
    }

    public void setTarifaPerHora(double tarifaPerHora) {
        this.tarifaPerHora = tarifaPerHora;
    }
    
    public double calcularSalari() {
        return horesTreballades * tarifaPerHora;
    }

}
