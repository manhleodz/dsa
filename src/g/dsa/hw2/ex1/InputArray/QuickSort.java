package g.dsa.hw2.ex1.InputArray;

import java.util.Arrays;

public class QuickSort {

    public QuickSort() {

    }

    public static int swapCount = 0;

    public static int compareCount = 0;

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            compareCount++;

            if (arr[j] <= pivot) {
                i++;

                swap(arr, i, j);

                swapCount++;
            }
        }

        swap(arr, i + 1, high);

        swapCount++;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            System.out.println("Array after loop: " + Arrays.toString(arr));

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}