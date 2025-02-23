package org.example.introduce;

import org.example.modules.Node;

public class LinkedList<T> {
    private Node<T> init;
    private Node<T> last;

    private int size;

    public void addElement (T element){
        Node<T> celula = new Node<T>(element);
        size++;

        if (size >= 1){
            this.last.setNext(celula);
        } else {
            this.init = celula;
        }
        this.last=celula;
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
