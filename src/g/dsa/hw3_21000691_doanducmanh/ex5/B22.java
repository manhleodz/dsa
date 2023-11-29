package g.dsa.hw3_21000691_doanducmanh.ex5;

import java.util.Scanner;

public class B22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.add(num);
        }

        int k = scanner.nextInt();
        int x = scanner.nextInt();

        linkedList.insert(k, x);

        System.out.println("List after insert " + x + " at " + k + ": ");
        linkedList.printList();
    }
}
