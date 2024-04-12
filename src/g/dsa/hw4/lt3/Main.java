package g.dsa.hw4.lt3;

import java.util.Stack;

public class Main {

    public static void deleteMid(Stack<Integer> s, int n) {

        Stack<Integer> back = new Stack<>();
        int mid = n / 2;


        for (int i = 0; i < mid; i++) {
            back.add(s.pop());
        }
        s.pop();
        for (int i = back.size() - 1; i >= 0; i--) {
            s.push(back.get(i));
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.print("Original stack: ");
        for (Integer element : stack) {
            System.out.print(element + " ");
        }

        deleteMid(stack, 6);
        System.out.println();
        System.out.print("After delete middle element, stack: ");
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
    }
}
