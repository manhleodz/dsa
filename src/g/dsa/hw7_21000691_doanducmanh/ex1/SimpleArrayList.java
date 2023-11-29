package g.dsa.hw7_21000691_doanducmanh.ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArrayList<T> implements ListInterface<T> {

    private T[] array;
    private int n = 0;
    private int defaultSize = 100;
    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }
    public SimpleArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }
    public boolean search(T x) {
        for (T i : array) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
    public void add(T data) {
        if (n == array.length) {
            expandArray();
        }
        array[n++] = data;
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        array[i] = data;
    }

    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                removeAt(i);
                return;
            }
        }
    }

    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public Iterator<T> iterator() {
        return new SimpleArrayListIterator();
    }
    private void removeAt(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, n - index - 1);
        n--;
    }
    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, n);
        array = newArray;
    }
    private class SimpleArrayListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < n;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[currentIndex++];
        }
    }
}
