package g.dsa.hw5.ex1.linked;

import g.dsa.hw5.ex1.BinaryTreeInterface;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {

    public static class Node<E> {
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node<E> getLeft() {
            return left;
        }

        public E getElement() {
            return element;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
    }

    private Node<E> root;
    private int size;

    public LinkedBinaryTree() {
        root = null;
        size = 0;
    }

    @Override
    public T root() {
        return (T) root;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int numChildren(T p) {
        Node<E> node = (Node<E>) p;
        int children = 0;
        if (node.left != null) children++;
        if (node.right != null) children++;
        return children;
    }

    @Override
    public T parent(T p) {
        Node<E> node = (Node<E>) p;
        return (T) node.parent;
    }

    @Override
    public T left(T p) {
        Node<E> node = (Node<E>) p;
        return (T) node.left;
    }

    @Override
    public T right(T p) {
        Node<E> node = (Node<E>) p;
        return (T) node.right;
    }

    @Override
    public T sibling(T p) {
        Node<E> node = (Node<E>) p;
        Node<E> parent = node.parent;
        if (parent == null) {
            return null;
        }
        if (parent.left == node) {
            return (T) parent.right;
        } else {
            return (T) parent.left;
        }
    }

    public Node<E> addRoot(E element) {
        if (!isEmpty()) {
            throw new IllegalStateException("Tree already has a root");
        }
        root = new Node<>(element, null, null, null);
        size = 1;
        return root;
    }

    public Node<E> addLeft(Node<E> p, E element) {
        if (p.left != null) {
            throw new IllegalStateException("Left child already exists");
        }
        Node<E> child = new Node<>(element, p, null, null);
        p.left = child;
        size++;
        return child;
    }

    public Node<E> addRight(Node<E> p, E element) {
        if (p.right != null) {
            throw new IllegalStateException("Right child already exists");
        }
        Node<E> child = new Node<>(element, p, null, null);
        p.right = child;
        size++;
        return child;
    }

    public void set(Node<E> p, E element) {
        p.element = element;
    }
}
