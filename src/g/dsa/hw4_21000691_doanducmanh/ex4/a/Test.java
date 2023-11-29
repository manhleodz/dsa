package g.dsa.hw4_21000691_doanducmanh.ex4.a;

import g.dsa.hw4_21000691_doanducmanh.ex4.QueueInterface;

public class Test {

    public static void main(String[] args) {
        QueueInterface<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        System.out.println("Array Queue:");
        for (Integer element : arrayQueue) {
            System.out.println(element);
        }

        System.out.println("Dequeued element: " + arrayQueue.dequeue());

        System.out.println("Is array queue empty? " + arrayQueue.isEmpty());

    }
}

