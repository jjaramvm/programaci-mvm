package com.mycompany.implementacioarbrebinarienjava;
public class ArbreCaracters extends ArbreBinari<Character> {
    public ArbreCaracters(int profunditat) {
        super(profunditat);
        arrel = creaArbre('A', profunditat);
    }

    @Override
    public Character creaNode(int valor, int profunditat) {
        return (char) (valor + 'A' - 1);
    }

    @Override
    protected void mostraNode(Character node) {
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
