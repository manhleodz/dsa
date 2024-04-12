package g.dsa.hw4.ex4.b;

import g.dsa.hw4.ex4.QueueInterface;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<E> implements QueueInterface<E> {

    private Node<E> head;
    private Node<E> tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            E element = head.element;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return element;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Iterator<E> iterator() {
        return new QueueIterator<>(head);
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

    private static class QueueIterator<E> implements Iterator<E> {
        private Node<E> current;

        public QueueIterator(Node<E> head) {
            current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E element = current.element;
            current = current.next;
            return element;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}