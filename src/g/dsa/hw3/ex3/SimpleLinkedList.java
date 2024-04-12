package g.dsa.hw3.ex3;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (top == null) {
            top = newNode;
            bot = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }

        n++;
    }

    public void addBot(T data) {
        add(data);
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }

        Node current = top;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        return current.data;
    }

    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }

        Node current = top;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }

        current.data = data;
    }

    public boolean isContain(T data) {
        Node current = top;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        T removedData = top.data;
        if (top == bot) {
            top = null;
            bot = null;
        } else {
            top = top.next;
        }

        n--;
        return removedData;
    }

    public T removeBot() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        T removedData = bot.data;
        if (top == bot) {
            top = null;
            bot = null;
        } else {
            Node current = top;
            while (current.next != bot) {
                current = current.next;
            }
            current.next = null;
            bot = current;
        }

        n--;
        return removedData;
    }

    public void remove(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        if (top.data.equals(data)) {
            removeTop();
            return;
        }

        Node current = top;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                n--;
                return;
            }
            current = current.next;
        }
    }
}