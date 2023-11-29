package g.dsa.hw6_21000691_doanducmanh.ex1.d;

import g.dsa.hw6_21000691_doanducmanh.ex1.Interface.Entry;

public class Main {
    public static void main(String[] args) {
        SortedLinkedPriorityQueue<Integer, String> pq = new SortedLinkedPriorityQueue<>();
        pq.insert(5, "Pizza");
        pq.insert(3, "Noddles");
        pq.insert(7, "Beef steak");
        pq.insert(1, "Rice");
        pq.insert(4, "KFC");
        System.out.println("Size: " + pq.size());
        System.out.println("Min: " + pq.min().getKey() + ", " + pq.min().getValue());
        while (!pq.isEmpty()) {
            Entry<Integer, String> e = pq.removeMin();
            System.out.println("Removed: " + e.getKey() + ", " + e.getValue());
        }
    }
}

