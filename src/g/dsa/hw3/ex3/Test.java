package g.dsa.hw3.ex3;

public class Test {

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List:");

        printList(list);

        list.addBot(4);
        System.out.println("After add 4 :");

        printList(list);

        int element = list.get(1);
        System.out.println("List at index 1: " + element);

        list.set(2, 5);
        System.out.println("List after change data of index 2:");

        printList(list);

        boolean contains = list.isContain(3);
        System.out.println("Contains 30: " + contains);

        int removedTop = list.removeTop();
        System.out.println("The data of top: " + removedTop);
        System.out.println("List after remove top:");

        printList(list);

        int removedBot = list.removeBot();
        System.out.println("The data of bottom: " + removedBot);
        System.out.println("List after remove bottom:");

        printList(list);

        list.remove(2);
        System.out.println("List after :");

        printList(list);

        System.out.println("Size: " + list.size());
        System.out.println("Is list empty:  " + list.isEmpty());
    }

    private static void printList(SimpleLinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

