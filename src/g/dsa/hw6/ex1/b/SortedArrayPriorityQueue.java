package g.dsa.hw6.ex1.b;

import g.dsa.hw6.ex1.Interface.Entry;
import g.dsa.hw6.ex1.Interface.PriorityQueueInterface;

public class SortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface<K, E> {

    protected class ArrEntry<K, E> implements Entry<K, E> {
        K key;
        E element;

        public ArrEntry(K k, E e) {
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public E getValue() {
            return this.element;
        }

        public void setValue(E element) {
            this.element = element;
        }

        public String toString() {
            return String.format("Key: %s - Element: %s\n", key.toString(), element.toString());
        }
    }

    Entry<K, E>[] array;
    int n = 0;
    int defaultsize = 1000;
    int head = 0;

    public SortedArrayPriorityQueue() {
        array = (Entry<K, E>[]) new ArrEntry[defaultsize];
    }

    public SortedArrayPriorityQueue(int capacity) {
        array = (Entry<K, E>[]) new ArrEntry[capacity];
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
        int position = (head + n) % array.length;
        int positionOrd = n;
        // Find position of added data
        for (int i = 0; i < n; i++) {
            int index = (head + i) % array.length;
            if (array[index].getKey().compareTo((K) entry.getKey()) == 1) {
                position = index;
                positionOrd = i;
                break;
            }
        }

        int size = n;
        while (size > positionOrd) {
            int index = (head + size) % array.length;
            int preInd = (head + size - 1) % array.length;
            array[index] = array[preInd];
            size--;
        }
        array[position] = entry;
        n++;
    }

    @Override
    public void insert(K k, E e) {
        Entry data = new ArrEntry(k, e);
        this.insert(data);
    }

    @Override
    public Entry removeMin() {
        Entry min = array[head];
        array[head] = null;
        head++;
        n--;
        return min;
    }

    @Override
    public Entry min() {
        return array[head];
    }

    public String toString() {
        String content = "";
        for (int i = 0; i < n; i++) {
            int index = (head + i) % array.length;
            content += array[index].toString();
        }
        return content;
    }
}
