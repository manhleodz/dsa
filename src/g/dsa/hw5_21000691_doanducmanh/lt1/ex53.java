package g.dsa.hw5_21000691_doanducmanh.lt1;

import java.util.Scanner;

public class ex53 {

    public static long pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a, b));
    }
}
