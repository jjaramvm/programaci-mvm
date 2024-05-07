package com.mycompany.empleats;

public class EmpleatPerComisio extends Empleat {

    private double vendesRealitzades;
    private double comisioPerVenta;

    public EmpleatPerComisio(String nom, double salari, double vendesRealitzades, double comisioPerVenta) {
        super(nom, salari);
        this.vendesRealitzades = vendesRealitzades;
        this.comisioPerVenta = comisioPerVenta;
    }

    public double getVendesRealitzades() {
        return vendesRealitzades;
    }

    public void setVendesRealitzades(double vendesRealitzades) {
        this.vendesRealitzades = vendesRealitzades;
    }

    public double getComisioPerVenta() {
        return comisioPerVenta;
    }

    public void setComisioPerVenta(double comisioPerVenta) {
        this.comisioPerVenta = comisioPerVenta;
    }
    
    public double calcularSalari() {
        return vendesRealitzades * comisioPerVenta;
    }

}
