package g.dsa.hw6.ex1.a;

import g.dsa.hw6.ex1.Interface.Entry;

public class Main {
    public static void main(String[] args) {
        UnsortedArrayPriorityQueue<Integer, String> queue = new UnsortedArrayPriorityQueue<>();

        queue.insert(3, "Entry 3");
        queue.insert(1, "Entry 1");
        queue.insert(4, "Entry 4");
        queue.insert(2, "Entry 2");

        System.out.println("Size: " + queue.size());

        System.out.println("Is empty? " + queue.isEmpty());

        Entry<Integer, String> minEntry = queue.min();
        System.out.println("Minimum entry: " + minEntry.getKey() + " - " + minEntry.getValue());

        Entry<Integer, String> removedEntry = queue.removeMin();
        System.out.println("Removed entry: " + removedEntry.getKey() + " - " + removedEntry.getValue());

        System.out.println("Updated size: " + queue.size());
    }
}
