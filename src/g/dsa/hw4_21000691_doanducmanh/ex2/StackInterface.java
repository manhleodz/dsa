package g.dsa.hw4_21000691_doanducmanh.ex2;

public interface StackInterface<E> extends Iterable<E> {

    void push(E element);

    E pop();

    boolean isEmpty();

    E top();
}
