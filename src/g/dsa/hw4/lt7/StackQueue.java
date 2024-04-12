package g.dsa.hw4.lt7;

import java.util.Stack;

public class StackQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {

        StackQueue stackQueue = new StackQueue();

        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(1);
        stackQueue.push(3);
        stackQueue.push(2);
        stackQueue.push(1);
        stackQueue.push(4);
        stackQueue.push(2);

        stackQueue.pop();
        stackQueue.pop();
        System.out.println(stackQueue.s2);
    }
}
