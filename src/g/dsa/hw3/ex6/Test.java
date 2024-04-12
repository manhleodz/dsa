package g.dsa.hw3.ex6;


public class Test {

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        linkedList.addAtHead(1);
        linkedList.addAtTail(4);
        linkedList.addAtIndex(1, 5);
        System.out.print("Original list: ");
        linkedList.printList();

        linkedList.deleteAtIndex(3);
        System.out.print("List after delete: ");
        linkedList.printList();
    }
}
