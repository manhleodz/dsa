package g.dsa.hw3.ex7;

public class Solution {

    public Solution() {

    }

    public static int getCount(Node head)
    {
        //Code here

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(5);

        System.out.println(getCount(a));
    }
}
