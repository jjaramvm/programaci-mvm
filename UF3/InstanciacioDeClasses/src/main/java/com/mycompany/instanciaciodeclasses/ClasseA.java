package com.mycompany.instanciaciodeclasses;


public class ClasseA {
    private int valorPrimari;
    private int valorSecundari;

    public ClasseA() {
        this.valorPrimari = 5;
        this.valorSecundari = 10;
    }

    public ClasseA(int vp) {
        this.valorPrimari = vp;
        this.valorSecundari = 10;
    }

    public ClasseA(int vp, int vs) {
        this.valorPrimari = vp;
        this.valorSecundari = vs;
    }

    public int getPrimari() {
        return this.valorPrimari;
    }

    public int getSecundari() {
        return this.valorSecundari;
    }

    public static void main(String[] args) {
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c = new ClasseA(20, 40);
        System.out.println("L'objecte _a:_ conté: " + a.getPrimari() + ", " + a.getSecundari());
        System.out.println("L'objecte _b:_ conté: " + b.getPrimari() + ", " + b.getSecundari());
        System.out.println("L'objecte _c:_ conté: " + c.getPrimari() + ", " + c.getSecundari());
    }
}
