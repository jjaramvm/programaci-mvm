package com.mycompany.implementacioarbrebinarienjava;

public class ArbreEnters extends ArbreBinari<Integer> {
    public ArbreEnters(int profunditat) {
        super(profunditat);
        arrel = creaArbre(1, profunditat);
    }

    @Override
    public Integer creaNode(int valor, int profunditat) {
        return valor;
    }

    @Override
    protected void mostraNode(Integer node) {
        System.out.println(node);
    }

    private Node creaArbre(int valor, int profunditat) {
        if (profunditat == 0) return null;

        Node node = new Node(creaNode(valor, profunditat), profunditat);
        node.setFillEsquerra(creaArbre(2 * valor, profunditat - 1));
        node.setFillDret(creaArbre(2 * valor + 1, profunditat - 1));

        return node;
    }
}
