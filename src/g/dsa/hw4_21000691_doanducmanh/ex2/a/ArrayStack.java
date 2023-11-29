package g.dsa.hw4_21000691_doanducmanh.ex2.a;


import g.dsa.hw4_21000691_doanducmanh.ex2.StackInterface;

import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {

    public static final int CAPACITY = 1000;

    private E[] data;

    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return (t + 1);
    }
    @Override
    public void push(E element) throws IllegalStateException{
        if (size() == data.length) throw new IllegalStateException("Stack is full");

        data[++t] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;

        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    @Override
    public boolean isEmpty() {
        return (t == -1);
    }

    @Override
    public E top() {
        if (isEmpty()) return null;

        return data[t];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
