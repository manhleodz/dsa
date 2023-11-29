package g.dsa.hw5_21000691_doanducmanh.lt1;

import java.util.Scanner;

public class ex54 {

    public static int gcd(int a, int b) {

        if (b == 0) return a;
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
