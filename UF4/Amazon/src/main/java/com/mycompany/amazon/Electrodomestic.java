package com.mycompany.amazon;

public class Electrodomestic extends Producte {
    
    private int mesosGarantia;

    public Electrodomestic(int Codi, String Nom, double Preu) {
        super(Codi, Nom, Preu);
    }

    public void setMesosGarantia(int mesosGarantia) {
        this.mesosGarantia = mesosGarantia;
    }

    @Override
    public double calcularPreuFinal() {
        // Aquí pots implementar la lògica per aplicar descomptes o recàrrecs segons la durada de la garantia
        return Preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mesos de garantia: " + mesosGarantia;
    }
}
    
