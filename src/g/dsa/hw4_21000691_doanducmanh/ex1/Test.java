package g.dsa.hw4_21000691_doanducmanh.ex1;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String hoten = "danghuyhoang";
        for (int i = 0; i < hoten.length(); i++) {
            if (i % 2 == 0) {
                s.push(hoten.charAt(i));
            }
            if (i % 3 == 0) {
                s.pop();
            }
        }

        for (Character element : s) {
            System.out.print(element);
        }
    }
}
