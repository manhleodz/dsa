package g.dsa.hw4.ex5;

import g.dsa.hw4.ex2.StackInterface;
import g.dsa.hw4.ex2.a.ArrayStack;

public class PalindromeChecker {

    public static void main(String[] args) {


        String a = "racecar";

        String b = "Love is all that I can give to you";

        System.out.println(a + " is palindrome: " + checker(a));
        System.out.println(b + " is palindrome: " + checker(b));
    }

    public static boolean checker(String a) {

        StackInterface<Character> stack = new ArrayStack<>();

        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (a.equals(reverseString)) {
            return true;
        }
        return false;
    }
}
