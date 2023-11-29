package g.dsa.hw4_21000691_doanducmanh.lt1;

import java.util.Scanner;
import java.util.Stack;

public class ex13 {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        Stack<Character> reverse = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            reverse.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(reverse.pop());
        }
    }
}
