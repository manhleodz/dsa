package g.dsa.hw6.ex1.d;

import g.dsa.hw6.ex1.Interface.Entry;
import g.dsa.hw6.ex1.Interface.PriorityQueueInterface;

public class SortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

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

    public SortedLinkedPriorityQueue() {
        this.head = null;
        this.tail = null;
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
        NodeEntry<K, E> node = new NodeEntry<K, E>((K) entry.getKey(), (E) entry.getValue());
        if (isEmpty()) {
            head = node;
        } else {
            NodeEntry<K, E> current = head;
            NodeEntry<K, E> prev = null;
            while (current != null && current.getKey().compareTo(node.getKey()) < 0) {
                prev = current;
                current = current.next;
            }
            if (prev == null) {
                node.next = head;
                head = node;
            } else {
                node.next = current;
                prev.next = node;
            }
        }
        n++;
    }

    @Override
    public void insert(Object o, Object o2) {
        NodeEntry<K, E> node = new NodeEntry<K, E>((K) o, (E) o2);
        if (isEmpty()) {
            head = node;
        } else {
            NodeEntry<K, E> current = head;
            NodeEntry<K, E> prev = null;
            while (current != null && current.getKey().compareTo(node.getKey()) < 0) {
                prev = current;
                current = current.next;
            }
            if (prev == null) {
                node.next = head;
                head = node;
            } else {
                node.next = current;
                prev.next = node;
            }
        }
        n++;
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) {
            return null;
        }
        NodeEntry<K, E> min = head;
        head = head.next;
        n--;
        return min;
    }

    @Override
    public Entry min() {
        if (isEmpty()) {
            return null;
        }
        return head;
    }
}
