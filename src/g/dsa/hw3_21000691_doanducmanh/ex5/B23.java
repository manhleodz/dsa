package g.dsa.hw3_21000691_doanducmanh.ex5;

import java.util.Scanner;

public class B23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.add(num);
        }

        int k = scanner.nextInt();

        linkedList.deleteAtIndex(k);

        System.out.print("List after delete at index " + k + ": ");
        linkedList.printList();
    }
}
