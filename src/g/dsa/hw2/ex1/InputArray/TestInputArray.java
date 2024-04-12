package g.dsa.hw2.ex1.InputArray;

import java.util.Arrays;
import java.util.Scanner;

public class TestInputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Input array length : ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//         InsertionSort

        InsertionSort insertionSort = new InsertionSort();
        int[] arr3 = arr.clone();
        long start1 = System.nanoTime();
        insertionSort.sort(arr3);
        long end1 = System.nanoTime();
        System.out.println(Arrays.toString(arr3));
        int swapCount3 = insertionSort.swapCount;
        System.out.println("Swaps: " + swapCount3);
        int compareCount3 = insertionSort.compareCount;
        System.out.println("Compares: " + compareCount3);
        System.out.println("Insertion sort time in nano seconds: " + (end1 - start1));
        System.out.println();


//         BubbleSort

        BubbleSort bubbleSort = new BubbleSort();
        int[] arr4 = arr.clone();
        long start2 = System.nanoTime();
        bubbleSort.sort(arr4);
        long end2 = System.nanoTime();
        System.out.println(Arrays.toString(arr4));
        int swapCount4 = bubbleSort.swapCount;
        System.out.println("Swaps: " + swapCount4);
        int compareCount4 = bubbleSort.compareCount;
        System.out.println("Compares: " + compareCount4);
        System.out.println("Bubble sort time in nano seconds: " + (end2 - start2));
        System.out.println();

        // SelectionSort

        SelectionSort selectionSort = new SelectionSort();
        int[] arr5 = arr.clone();
        long start3 = System.nanoTime();
        selectionSort.sort(arr5);
        long end3 = System.nanoTime();
        System.out.println(Arrays.toString(arr5));
        int swapCount5 = selectionSort.swapCount;
        System.out.println("Swaps: " + swapCount5);
        int compareCount5 = selectionSort.compareCount;
        System.out.println("Compares: " + compareCount5);
        System.out.println("Selection sort time in nano seconds: " + (end3 - start3));
        System.out.println();
//
        // MergeSort

        MergeSort ob = new MergeSort();
        int[] arr1 = arr.clone();
        long start4 = System.nanoTime();
        System.out.println();
        ob.sort(arr1, 0, arr1.length - 1);
        long end4 = System.nanoTime();
        int swapCount = ob.swapCount;
        System.out.println("Swaps: " + swapCount);
        int compareCount = ob.compareCount;
        System.out.println("Compares: " + compareCount);
        System.out.println("Merge sort time in nano seconds: " + (end4 - start4));
        System.out.println();

        //QuickSort

        QuickSort ob2 = new QuickSort();
        int[] arr2 = arr.clone();
        long start5 = System.nanoTime();
        ob2.quickSort(arr2, 0, arr2.length - 1);
        long end5 = System.nanoTime();
        int swapCount2 = ob2.swapCount;
        System.out.println("Swaps: " + swapCount2);
        int compareCount2 = ob2.compareCount;
        System.out.println("Compares: " + compareCount2);
        System.out.println("Quick sort time in nano second: " + (end5 - start5));
    }
}
