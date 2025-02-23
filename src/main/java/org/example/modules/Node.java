package org.example.modules;

public class Node<T> {
    private T element;
    private Node next;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T element) {
        this.element = element;
        this.next = null;
    }
    public Node(T element, Node next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
