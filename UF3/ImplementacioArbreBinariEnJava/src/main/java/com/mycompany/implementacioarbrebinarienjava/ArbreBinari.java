package com.mycompany.implementacioarbrebinarienjava;

public abstract class ArbreBinari<T> {
    private static int totalInstancies = 0;

    public static int getTotalInstancies() {
        return totalInstancies;
    }

    protected static void incrementaTotalInstancies() {
        totalInstancies++;
    }

    protected static void decrementaTotalInstàncies() {
        totalInstancies--;
    }

    protected abstract T creaNode(int valor, int profunditat);

    protected abstract void mostraNode(T node);

    protected class Node {
        private final T valor;
        private Node fillEsquerra;
        private Node fillDret;
        private final int profunditatMàxima;

        public Node(T valor, int profunditatMaxima) {
            this.valor = valor;
            this.profunditatMàxima = profunditatMaxima;
            incrementaTotalInstancies();
        }

        public T getValor() {
            return valor;
        }

        public Node getFillEsquerra() {
            return fillEsquerra;
        }

        public Node getFillDret() {
            return fillDret;
        }

        public void setFillEsquerra(Node fillEsquerra) {
            this.fillEsquerra = fillEsquerra;
        }

        public void setFillDret(Node fillDret) {
            this.fillDret = fillDret;
        }

        public int getProfunditatMàxima() {
            return profunditatMàxima;
        }
    }

    protected Node arrel;
    private final int profunditat;

    protected ArbreBinari(int profunditat) {
        this.profunditat = profunditat;
        incrementaTotalInstancies();
    }

    public Node getArrel() {
        return arrel;
    }

    public int getProfunditat() {
        return profunditat;
    }

    public void recorreBranquesDretes() {
        recorreBranquesDretes(arrel);
    }

    private void recorreBranquesDretes(Node node) {
        if (node == null) return;

        mostraNode(node.getValor());
        recorreBranquesDretes(node.getFillDret());
    }

    public void recorreBranquesEsquerres() {
        recorreBranquesEsquerres(arrel);
    }

    private void recorreBranquesEsquerres(Node node) {
        if (node == null) return;

        mostraNode(node.getValor());
        recorreBranquesEsquerres(node.getFillEsquerra());
    }

}