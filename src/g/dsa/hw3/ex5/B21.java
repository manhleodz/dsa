package g.dsa.hw3.ex5;

import java.util.Scanner;

public class B21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.add(num);
        }

        linkedList.printList();
    }
}
