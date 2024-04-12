package g.dsa.hw5.lt1;

import java.util.Scanner;

public class ex55 {

    public static long fibonacii(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacii(n - 1) + fibonacii(n -2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacii(n));
    }
}
