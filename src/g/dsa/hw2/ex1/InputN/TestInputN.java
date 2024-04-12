package g.dsa.hw2.ex1.InputN;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


// Thuật toán so sánh tương  tự inputArray,
// nên em không cho in ra kết quả vì chạy số lớn sẽ rất mất thời gian

public class TestInputN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input array length: ");
        int N = sc.nextInt();

        int[] arr = randomArray(N);


//         InsertionSort

        long totalTime1 = 0;
        InsertionSort insertionSort = new InsertionSort();
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            insertionSort.sort(arr.clone());
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime1 += elapsedTime;
        }
        long averageTime1 = (long) totalTime1 / 20;
        System.out.println("Insertion sort time in nano seconds: " + averageTime1);

        System.out.println();


////         BubbleSort

        long totalTime2 = 0;
        BubbleSort bubbleSort = new BubbleSort();
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            bubbleSort.sort(arr.clone());
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime2 += elapsedTime;
        }
        long averageTime2 = (long) totalTime2 / 20;
        System.out.println("Bubble sort time in nano seconds: " + averageTime2);

        //        // SelectionSort

        long totalTime3 = 0;
        SelectionSort selectionSort = new SelectionSort();
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            selectionSort.sort(arr.clone());
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime3 += elapsedTime;
        }
        long averageTime3 = (long) totalTime3 / 20;
        System.out.println("Selection sort time in nano seconds: " + averageTime3);

//        // MergeSort

        long totalTime4 = 0;
        MergeSort mergeSort = new MergeSort();
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            mergeSort.sort(arr.clone(), 0, arr.length-1);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime4 += elapsedTime;
        }
        long averageTime4 = (long) totalTime4 / 20;
        System.out.println("Merge sort time in nano seconds: " + averageTime4);

        //QuickSort

        long totalTime5 = 0;
        QuickSort quickSort = new QuickSort();
        for (int i = 0; i < 20; i++) {
            long start1 = System.nanoTime();
            quickSort.quickSort(arr.clone(), 0, arr.length-1);
            long end1 = System.nanoTime();
            long elapsedTime = end1 - start1;
            totalTime5 += elapsedTime;
        }
        long averageTime5 = (long) totalTime5 / 20;
        System.out.println("QuickSort sort time in nano seconds: " + averageTime5);

        long[] rank = new long[5];
        rank[0] = averageTime1;
        rank[1] = averageTime2;
        rank[2] = averageTime3;
        rank[3] = averageTime4;
        rank[4] = averageTime5;

        Arrays.sort(rank);
        System.out.println(Arrays.toString(rank));
    }

    // Make random array
    public static int[] randomArray(int N) {

        int[] arr = new int[N];
        Random random = new Random();
        int min = 1;
        int max = (int) Math.pow(10, 6);

        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            arr[i] = randomNumber;
        }

        System.out.print("Random array: [");
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }
}
