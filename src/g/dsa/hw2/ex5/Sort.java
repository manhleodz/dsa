package g.dsa.hw2.ex5;

import java.util.Scanner;

public class Sort {

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
        System.out.print("Sorted array: ");
        printArray(increasingArr);
        System.out.println();

        int[] reverseArr = decreasing(a.clone());
        System.out.print("Reverse array: ");
        printArray(reverseArr);
    }
}
