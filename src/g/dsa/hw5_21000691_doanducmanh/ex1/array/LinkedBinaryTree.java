package g.dsa.hw5_21000691_doanducmanh.ex1.array;

import g.dsa.hw5_21000691_doanducmanh.ex1.BinaryTreeInterface;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {
    private E[] array;
    private int n = 0;
    private int defaultSize = 100;

    public LinkedBinaryTree() {
        array = (E[]) new Object[defaultSize];
    }

    // Helper method to check if a given index is valid
    private boolean isValidIndex(int index) {
        return index >= 1 && index <= n;
    }

    @Override
    public T root() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[1];
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
    public int numChildren(T p) {
        int index = findIndex(p);
        if (!isValidIndex(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        int numChildren = 0;
        if (2 * index <= n && array[2 * index] != null) {
            numChildren++;
        }
        if (2 * index + 1 <= n && array[2 * index + 1] != null) {
            numChildren++;
        }
        return numChildren;
    }

    @Override
    public T parent(T p) {
        int index = findIndex(p);
        if (!isValidIndex(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (index == 1) {
            return null; // Root has no parent
        }
        return (T) array[index / 2];
    }

    @Override
    public T left(T p) {
        int index = findIndex(p);
        if (!isValidIndex(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        int leftChildIndex = 2 * index;
        if (isValidIndex(leftChildIndex)) {
            return (T) array[leftChildIndex];
        }
        return null;
    }

    @Override
    public T right(T p) {
        int index = findIndex(p);
        if (!isValidIndex(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        int rightChildIndex = 2 * index + 1;
        if (isValidIndex(rightChildIndex)) {
            return (T) array[rightChildIndex];
        }
        return null;
    }

    @Override
    public T sibling(T p) {
        int index = findIndex(p);
        if (!isValidIndex(index)) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (index == 1) {
            return null;
        }
        if (index % 2 == 0) {
            int siblingIndex = index + 1;
            if (isValidIndex(siblingIndex)) {
                return (T) array[siblingIndex];
            }
        } else {
            int siblingIndex = index - 1;
            if (isValidIndex(siblingIndex)) {
                return (T) array[siblingIndex];
            }
        }
        return null;
    }

    private int findIndex(T element) {
        for (int i = 1; i <= n; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void setRoot(E element) {
        if (isEmpty()) {
            array[1] = element;
            n = 1;
        } else {
            array[1] = element;
        }
    }

    public void setLeft(int p, E element) {
        if (isValidIndex(p)) {
            array[2 * p] = element;
            if (2 * p > n) {
                n = 2 * p;
            }
        } else {
            throw new IllegalArgumentException("Invalid position");
        }
    }

    public void setRight(int p, E element) {
        if (isValidIndex(p)) {
            array[2 * p + 1] = element;
            if (2 * p + 1 > n) {
                n = 2 * p + 1;
            }
        } else {
            throw new IllegalArgumentException("Invalid position");
        }
    }
}