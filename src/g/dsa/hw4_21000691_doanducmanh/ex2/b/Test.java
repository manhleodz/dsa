package g.dsa.hw4_21000691_doanducmanh.ex2.b;

public class Test {
    public static void main(String[] args) {

        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack elements:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        int topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        System.out.println("Top element: " + stack.top());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
