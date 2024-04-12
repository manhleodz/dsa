package g.dsa.hw2.ex2.InputN;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static Number[] generateRandomArray(int N) {
        Random random = new Random();
        Number[] array = new Number[N];
        for (int i = 0; i < N; i++) {

            int value = random.nextInt(1000000) + 1;

            Number number = new Number(value);

            array[i] = number;
        }
        return array;
    }

    public static void printArray(Number[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static Number[] copyArray(Number[] array) {
        int n = array.length;
        Number[] copy = new Number[n];
        for (int i = 0; i < n; i++) {
            copy[i] = array[i];
        }
        return copy;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị của N: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("Sinh dãy gồm " + N + " số ngẫu nhiên trong khoảng [1, 10^6]:");
        Number[] originalArray = generateRandomArray(N);
        printArray(originalArray);

        System.out.println("Đo thời gian thực thi các thuật toán sắp xếp:");
        long startTime, endTime, duration;


        long totalTime1 = 0;
        Number[] bubbleArray = copyArray(originalArray);
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            SortingAlgorithms.bubbleSort(bubbleArray);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime1 += elapsedTime;
        }
        long averageTime1 = (long) totalTime1 / 20;
        System.out.println("Thời gian thực thi thuật toán bubble sort: " + averageTime1);

        long totalTime2 = 0;
        Number[] selectionArray = copyArray(originalArray);
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            SortingAlgorithms.selectionSort(selectionArray);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime2 += elapsedTime;
        }
        long averageTime2 = (long) totalTime2 / 20;
        System.out.println("Thời gian thực thi thuật toán selection sort: " + averageTime2);


        long totalTime3 = 0;
        Number[] insertionArray = copyArray(originalArray);
        for (int i = 0; i< 20; i++) {
            long start1 = System.nanoTime();
            SortingAlgorithms.insertionSort(insertionArray);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime3 += elapsedTime;

        }
        long averageTime3 = (long) totalTime3 / 20;
        System.out.println("Thời gian thực thi thuật toán insertion sort: " + averageTime3);


        long totalTime4 = 0;
        Number[] mergeArray = copyArray(originalArray);
        for (int i = 0; i< 20; i++) {
            long start1 = System.nanoTime();
            SortingAlgorithms.mergeSort(mergeArray);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime4 += elapsedTime;
        }
        long averageTime4 = (long) totalTime4 / 20;
        System.out.println("Thời gian thực thi thuật toán merge sort: " + averageTime4);


        long totalTime5 = 0;
        Number[] quickArray = copyArray(originalArray);
        for (int i = 0; i< 20; i++) {
            long start1 = System.nanoTime();
            SortingAlgorithms.quickSort(quickArray);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime5 += elapsedTime;
        }
        long averageTime5 = (long) totalTime5 / 20;
        System.out.println("Thời gian thực thi thuật toán quick sort: " + averageTime5);

        System.out.println("Dãy sau khi sắp xếp:");
        printArray(quickArray);
    }
}
