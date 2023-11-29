package g.dsa.hw3_21000691_doanducmanh;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 100;

    @SuppressWarnings("unchecked")
    public SimpleArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public SimpleArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        array = (T[]) new Object[capacity];
    }

    public void add(T data) {
        if (size == array.length) {
            // If the array is full, resize it
            resizeArray();
        }
        array[size++] = data;
    }

    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[i];
    }

    public void set(int i, T data) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array[i] = data;
    }

    public void remove(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                // Shift elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public boolean isContain(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            public boolean hasNext() {
                return currentIndex < size;
            }

            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return array[currentIndex++];
            }
        };
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
