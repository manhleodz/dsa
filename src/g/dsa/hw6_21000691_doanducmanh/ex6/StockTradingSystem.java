package g.dsa.hw6_21000691_doanducmanh.ex6;

import g.dsa.hw6_21000691_doanducmanh.ex1.Interface.Entry;
import g.dsa.hw6_21000691_doanducmanh.ex2.MinHeapPriorityQueue;

public class StockTradingSystem {
    private MinHeapPriorityQueue<Integer, String> orderQueue;

    public StockTradingSystem() {
        orderQueue = new MinHeapPriorityQueue<>();
    }

    public void placeOrder(int price, String orderType) {
        orderQueue.insert(price, orderType);
    }

    public String processNextOrder() {
        if (orderQueue.isEmpty()) {
            return "No orders in the system.";
        } else {
            Entry<Integer, String> nextOrder = orderQueue.removeMin();
            return "Processing order: " + nextOrder.getValue() + " at " + nextOrder.getKey() + " price.";
        }
    }

    public static void main(String[] args) {
        StockTradingSystem system = new StockTradingSystem();

        // Place sample orders
        system.placeOrder(100, "Buy");
        system.placeOrder(150, "Sell");
        system.placeOrder(120, "Buy");
        system.placeOrder(200, "Sell");

        // Process orders
        System.out.println(system.processNextOrder());
        System.out.println(system.processNextOrder());
        System.out.println(system.processNextOrder());
        System.out.println(system.processNextOrder());
        System.out.println(system.processNextOrder());
    }
}
