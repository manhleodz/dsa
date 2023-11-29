package g.dsa.hw3_21000691_doanducmanh.ex5;

public class LinkedList {

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
        } else {
            Node current = head;
            Node prev = null;
            int count = 0;
            while (current != null && count < index) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current != null) {
                prev.next = current.next;
            }
        }
    }

    public void insert(int index, int data) {

        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            Node prev = null;
            int count = 0;
            while (current != null && count < index) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current == null) {
                Node newNode = new Node(data);
                prev.next = newNode;
            } else {
                Node newNode = new Node(data);
                newNode.next = current;
                prev.next = newNode;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
