package g.dsa.hw2_21000691_doanducmanh.ex7;

import java.util.Scanner;

public class Ex7 {

    public static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] input(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Input array values: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length: ");
        int[] a = input(sc);

        System.out.print("Input x: ");
        int x = sc.nextInt();
        sc.close();

        int result= 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a.length && j != i; j++) {
                if (i == x-1 || j == x-1) {
                    continue;
                }
                if(a[i] + a[j] == a[x-1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
