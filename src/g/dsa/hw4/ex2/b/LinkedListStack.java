package g.dsa.hw4.ex2.b;

import g.dsa.hw4.ex2.StackInterface;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {

    public class Node {
        E element;
        Node next;
    }

    private Node stack = null;

    @Override
    public void push(E element) {
        Node newNode = new Node();
        newNode.element = element;
        newNode.next = stack;
        stack = newNode;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E topElement = stack.element;
        stack = stack.next;
        return topElement;

    }

    @Override
    public boolean isEmpty() {
        return stack == null;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return stack.element;

    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    class StackIterator implements Iterator<E> {
        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }
}
