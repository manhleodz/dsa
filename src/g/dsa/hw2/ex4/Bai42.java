package g.dsa.hw2.ex4;

import java.util.Scanner;

public class Bai42 {
    public static int[] sort(int[] newArr){
        int keyValue;
        int keyIdx;
        for (int i = 0; i < newArr.length; i++) {
            keyValue = newArr[i];
            keyIdx = i;
            while ((keyIdx > 0) && (newArr[keyIdx - 1] > keyValue)) {
                newArr[keyIdx] = newArr[keyIdx - 1];
                keyIdx--;
            }
            newArr[keyIdx] = keyValue;
        }
        return newArr;
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
