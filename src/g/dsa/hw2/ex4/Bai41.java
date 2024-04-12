package g.dsa.hw2.ex4;

import java.util.*;

public class Bai41 {
    public static int[] sort(int[] a){
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length-i-1;j++) {
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }
    public static void printArray(int[] a){
        System.out.print("Sorted array: ");
        for(int i=0; i<a.length;i++) {
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
        a = sort(a);
        printArray(a);
    }
}