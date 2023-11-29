package g.dsa.hw4_21000691_doanducmanh.ex4;

public interface QueueInterface<E> extends Iterable<E>{

    void enqueue(E element);

    E dequeue();

    boolean isEmpty();
}
