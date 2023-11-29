package g.dsa.hw2_21000691_doanducmanh.ex1.InputN;

public class QuickSort {

    public QuickSort() {

    }

    public static long swapCount = 0;

    public static long compareCount = 0;

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

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
