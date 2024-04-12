package g.ck;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Input a number: ");
        int a = sc.nextInt();

        while (a > 0) {
            int soDu = a % 2;
            myStack.push(soDu);
            a /= 2;
        }
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }

    }
}
