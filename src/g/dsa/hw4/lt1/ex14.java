package g.dsa.hw4.lt1;

import java.util.Scanner;
import java.util.Stack;

public class ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        stackBin(n);

    }

    public static void stackBin(int n) {
        Stack<Integer> bin = new Stack<>();

        while (n != 0) {
            bin.push(n % 2);
            n = n / 2;
        }

        while (!bin.isEmpty()) {
            System.out.print(bin.pop());
        }
    }
}
