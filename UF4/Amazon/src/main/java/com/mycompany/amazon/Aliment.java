package com.mycompany.amazon;

import java.time.LocalDate;

public class Aliment extends Producte {
    
    private LocalDate dataCaducitat;

    public Aliment(int Codi, String Nom, double Preu) {
        super(Codi, Nom, Preu);
    }

    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public double calcularPreuFinal() {
        // Aquí pots implementar la lògica per aplicar descomptes o recàrrecs segons la proximitat a la data de caducitat
        return Preu;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de caducitat: " + dataCaducitat;
    }
    
}
