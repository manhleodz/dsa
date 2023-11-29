package g.dsa.hw5_21000691_doanducmanh.ex2;

import g.dsa.hw5_21000691_doanducmanh.ex1.linked.LinkedBinaryTree;

public class ExpressionTree<E> extends LinkedBinaryTree {

    public void preorderPrint(Node<E> p) {
        if (p != null) {
            System.out.print(p.getElement() + " ");
            preorderPrint(p.getLeft());
            preorderPrint(p.getRight());
        }
    }

    public void postorderPrint(Node<E> p) {
        if (p != null) {
            postorderPrint(p.getLeft());
            postorderPrint(p.getRight());
            System.out.print(p.getElement() + " ");
        }
    }

    public void inorderPrint(Node<E> p) {
        if (p != null) {

            if (p.getLeft() != null) {
                System.out.print("(");
                inorderPrint(p.getLeft());
            }
            System.out.print(p.getElement());
            if (p.getRight() != null) {
                inorderPrint(p.getRight());
                System.out.print(")");
            }
        }
    }
}
