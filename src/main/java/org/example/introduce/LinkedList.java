package org.example.introduce;

import org.example.modules.Node;

public class LinkedList<T> {
    private Node<T> init;
    private int size;

    public void addElement (T element){
        Node<T> celula = new Node<T>(element);
        this.init = celula;
        this.size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "init=" + init +
                '}';
    }
}
