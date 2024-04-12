package g.dsa.hw2.ex6;

import java.util.Scanner;

public class Ex6 {
    public static int[] increasing(int[] newArr){
        for ( int i = 0 ; i < newArr.length - 1 ; i++ ) {
            int minIdx = i;
            for ( int j = i + 1 ; j < newArr.length ; j++ ) {
                if (newArr[minIdx] > newArr[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = newArr[i];
                newArr[i] = newArr[minIdx];
                newArr[minIdx] = temp;
            }
        }
        return newArr;
    }

    public static int[] decreasing(int[] newArr) {
        for ( int i = 0 ; i < newArr.length - 1 ; i++ ) {
            int minIdx = i;
            for ( int j = i + 1 ; j < newArr.length ; j++ ) {
                if (newArr[minIdx] < newArr[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = newArr[minIdx];
                newArr[minIdx] = newArr[i];
                newArr[i] = temp;
            }
        }
        return newArr;
    }
    public static void printArray(int[] a){

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
        int[] increasingArr = increasing(a.clone());

        System.out.print("Choose smallest number k: ");
        int k = sc.nextInt();
        if(k >= a.length || k < 0) {
            System.out.println("k is out of index");
        } else {
            System.out.print("Value of k is: " + increasingArr[k-1]);

        }
        System.out.println();

        int[] reverseArr = decreasing(a.clone());
        System.out.print("Choose biggest number m: ");
        int m = sc.nextInt();
        if(m >= a.length || m < 0) {
            System.out.println("m is out of index");
        } else {
            System.out.print("Value of m is: " + reverseArr[m-1]);

        }
    }
}
