package g.dsa.hw6.ex1.b;

import g.dsa.hw6.ex1.Interface.Entry;
import g.dsa.hw6.ex1.Interface.PriorityQueueInterface;

public class Main {
    public static void main (String[] args) {

        PriorityQueueInterface<Integer, String> sortedQueue = new SortedArrayPriorityQueue<>();
        sortedQueue.insert(5, "five");
        sortedQueue.insert(1, "one");
        sortedQueue.insert(3, "three");
        sortedQueue.insert(4, "four");
        sortedQueue.insert(2, "two");
        System.out.println("Sorted queue size: " + sortedQueue.size());
        System.out.println("Sorted queue min: " + sortedQueue.min().getKey() + ", " + sortedQueue.min().getValue());
        System.out.println("Sorted queue elements:");
        while (!sortedQueue.isEmpty()) {
            Entry<Integer, String> entry = sortedQueue.removeMin();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}

