package g.dsa.hw6.ex1.a;

import g.dsa.hw6.ex1.Interface.Entry;
import g.dsa.hw6.ex1.Interface.PriorityQueueInterface;

public class UnsortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

    protected class ArrEntry<K, E> implements Entry<K, E>{
        K key;
        E element;

        public ArrEntry (K k, E e){
            this.key = k;
            this.element = e;
        }

        @Override
        public K getKey() { return this.key;}
        @Override
        public E getValue() { return this.element;}

        @Override
        public String toString() {
            return String.format("Key: %s - Element: %s\n", key.toString(), element.toString());
        }
    }

    Entry<K, E> [] array;
    int n = 0;
    int defaultsize = 1000;

    public UnsortedArrayPriorityQueue () { array = (Entry<K, E>[]) new ArrEntry[defaultsize];}
    public UnsortedArrayPriorityQueue (int capacity) { array = (Entry<K, E>[]) new ArrEntry[capacity];}

    @Override
    public int size() { return n;}
    @Override
    public boolean isEmpty() { return n==0;}
    @Override
    public void insert(Entry entry) { array[n++] = entry;}

    @Override
    public void insert(Object k, Object e) {
        Entry data = new ArrEntry(k, e);
        this.insert(data);
    }

    @Override
    public Entry removeMin() {
        if (isEmpty()) throw new IllegalArgumentException("Priority Queue is empty!");
        Entry min = this.min();
        for (int i=0; i<n; i++) {
            if (array[i] == min) array[i] = array[i+1];
        }
        n--;
        return min;
    }

    @Override
    public Entry min() {
        if (isEmpty()) throw new IllegalArgumentException("Priority Queue is empty!");
        Entry min = array[0];
        for (int i=1; i<n; i++) {
            if (array[i].getKey().compareTo(min.getKey()) == -1) min = array[i];
        }
        return min;
    }

    public String toString() {
        String content = "";
        for (int i=0; i<n; i++) content += array[i].toString();
        return content;
    }
}
