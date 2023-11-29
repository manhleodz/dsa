package g.dsa.hw4_21000691_doanducmanh.ex4.b;

import g.dsa.hw4_21000691_doanducmanh.ex4.QueueInterface;

public class Test {
    public static void main(String[] args) {
        QueueInterface<String> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue("Hello");
        linkedQueue.enqueue("I");
        linkedQueue.enqueue("am");
        linkedQueue.enqueue("Manh");

        System.out.println("Linked Queue:");
        for (String element : linkedQueue) {
            System.out.println(element);
        }

        System.out.println("Dequeued element: " + linkedQueue.dequeue());

        System.out.println("Is linked queue empty? " + linkedQueue.isEmpty());
    }
}
