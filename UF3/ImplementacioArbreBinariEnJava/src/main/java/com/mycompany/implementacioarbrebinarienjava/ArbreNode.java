package com.mycompany.implementacioarbrebinarienjava;

public class ArbreNode<T> {
    T value;
    ArbreNode<T> left;
    ArbreNode<T> right;

    public ArbreNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
