package g.dsa.hw3.ex8;

public class Solution {
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        Node current = head , nthNode = head;

        while(n!=0)
        {
            if(current==null)
                return -1;
            current = current.next;
            n--;
        }

        while(current!=null)
        {
            nthNode = nthNode.next;
            current = current.next;
        }

        if(nthNode!=null)
            return nthNode.data;
        else
            return -1;
    }

    public static void main(String[] args) {

        Node a = new Node(3);
        a.next = new Node(6);
        a.next.next = new Node(1);

        Solution result = new Solution();
        System.out.println(result.getNthFromLast(a, 4));
    }
}
