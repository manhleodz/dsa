package g.dsa.hw6.ex1.c;

import g.dsa.hw6.ex1.Interface.Entry;
import g.dsa.hw6.ex1.Interface.PriorityQueueInterface;

public class UnsortedLinkedPriorityQueue <K extends  Comparable, E> implements PriorityQueueInterface {

    protected class NodeEntry<K, E> implements Entry<K, E> {

        private K key;

        private E element;

        private NodeEntry<K, E> next;

        public NodeEntry(K k, E e) {
            key = k;
            element = e;
            next = null;
        }

        public void ArrEntry(K k, E e) {
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public E getValue() {
            return element;
        }
    }

    private NodeEntry<K, E> head;

    private NodeEntry<K, E> tail;

    int n = 0;

    public UnsortedLinkedPriorityQueue() {
        head = null;
        tail = null;
        n = 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public void insert(Entry entry) {
        NodeEntry<K, E> node = new NodeEntry<K, E>((K)(entry.getKey()), (E)(entry.getValue()));
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        NodeEntry <K , E > node = new NodeEntry <K, E >((K) o, (E)o2);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        n++;
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry <K , E > min = head;
        NodeEntry <K , E > prev = null;
        NodeEntry <K , E > current = head.next;
        NodeEntry <K , E > before = head;
        while (current != null) {
            if (current.getKey().compareTo(min.getKey()) < 0) {
                min = current;
                prev = before;
            }
            before = current;
            current = current.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = min.next;
        }
        if (min == tail) {
            tail = prev;
        }
        n--;
        return min;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry <K , E > min = head;
        NodeEntry <K , E > current = head.next;
        while (current != null) {
            if (current.getKey().compareTo(min.getKey()) < 0) {
                min = current;
            }
            current = current.next;
        }
        return min;
    }
}
