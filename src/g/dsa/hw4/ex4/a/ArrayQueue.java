package g.dsa.hw4.ex4.a;

import g.dsa.hw4.ex4.QueueInterface;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E[] queue;
    private int n = 0;
    private int top = 0;
    private int count = 0;
    private int default_size = 100;

    public ArrayQueue(int capacity) {
        n = capacity;
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        n = default_size;
        queue = (E[]) new Object[default_size];
    }

    @Override
    public void enqueue(E element) {
        if (count == n) {
            throw new IllegalStateException("Queue is full");
        }
        int index = (top + count) % n;
        queue[index] = element;
        count++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E element = queue[top];
        queue[top] = null;
        top = (top + 1) % n;
        count--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }

    class ArrayQueueIterator implements Iterator<E> {
        private int current = top;
        private int num = 0;

        @Override
        public boolean hasNext() {
            return num < count;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the queue");
            }
            E data = queue[(current + num) % n];
            num++;
            return data;
        }
    }
}