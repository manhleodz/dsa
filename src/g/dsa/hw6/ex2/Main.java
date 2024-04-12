package g.dsa.hw6.ex2;

import g.dsa.hw6.ex1.Interface.Entry;

public class Main {
    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer, String> priorityQ = new MinHeapPriorityQueue<>();

        System.out.println("Priority Queue is empty? " + priorityQ.isEmpty());

        priorityQ.insert(90, "Sperm whale");
        priorityQ.insert(95, "Whale");
        priorityQ.insert(85, "Titanosauria ");
        priorityQ.insert(70, "Megalodon");
        priorityQ.insert(86, "Quetzalcoatlus");
        priorityQ.insert(100, "dinosaur");

        System.out.println("\nPRIORY QUEUE: \n" + priorityQ);

        System.out.println("\nREMOVE MIN ELEMENT IN PQ:");
        Entry removed = priorityQ.removeMin();
        System.out.println("Removed: " + removed.toString());

        System.out.println("\nPRIORY QUEUE NOW: \n" + priorityQ);
        System.out.println(priorityQ.size());
    }
}
