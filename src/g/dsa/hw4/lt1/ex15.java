package g.dsa.hw4.lt1;

import java.util.Scanner;
import java.util.Stack;

public class ex15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input += "!";

        System.out.print(encodeString(input));
    }

    public static StringBuilder encodeString(String input) {

        Stack<Character> st = new Stack<>();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (st.isEmpty() || input.charAt(i) == st.peek()) {
                st.push(input.charAt(i));
            } else {
                int cnt = 0;
                output.append(st.peek());
                while (!st.isEmpty()) {
                    cnt++;
                    st.pop();
                }
                output.append(cnt);
                st.push(input.charAt(i));
            }
        }

        return output;
    }
}
