package g.dsa.hw5.lt1;

import java.util.Scanner;

public class ex52 {

    public static long recursion(int n ) {
        if (n == 0) return 1;
        return n * recursion(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}
