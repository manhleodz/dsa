package g.dsa.hw3_21000691_doanducmanh.ex2;

public interface ListInterface <T> extends Iterable<T>{

    void add(T data);

    T get(int i);

    void set(int i, T data);

    void remove(T data);

    boolean isContain(T data);

    int size();

    boolean isEmpty();
}
