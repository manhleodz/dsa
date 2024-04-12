package g.dsa.hw2.ex2.InputArray;

import java.util.Arrays;

public class SortExample<T extends Comparable<T>> {


    // Bubble Sort
    public void bubbleSort(T[] array) {
        int swaps = 0;
        int compares = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                compares++;
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        System.out.println("Swaps: " + swaps);
        System.out.println("Compares: " + compares);
    }


    // Selection Sort
    public void selectionSort(T[] array) {
        int swaps = 0;
        int compares = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
                compares++;
            }
            T temp = array[minIndex];
            System.out.println(Arrays.toString(array));
            array[minIndex] = array[i];
            array[i] = temp;
            swaps++;
        }
        System.out.println("Swaps: " + swaps);
        System.out.println("Compares: " + compares);
    }

    // Insertion Sort
    public void insertionSort(T[] array) {
        int swaps = 0;
        int compares = 0;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T key = array[i];
            int j = i - 1;
            System.out.println(Arrays.toString(array));
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
                compares++;
                swaps++;
            }
            array[j + 1] = key;
            compares++;
        }
        System.out.println("Swaps: " + swaps);
        System.out.println("Compares: " + compares);
    }

    // Merge Sort

    static int mergeSwaps = 0;
    static int mergeCompares = 0;

    public void mergeSort(T[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            T[] left = Arrays.copyOfRange(array, 0, mid);
            T[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);

        }
    }

    private void merge(T[] array, T[] left, T[] right) {

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            mergeCompares++;
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
                mergeSwaps++;
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    static int quickSwaps = 0;
    static int quickCompares = 0;

    // Quick Sort
    public void quickSort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            System.out.println("Array after loop: " + Arrays.toString(array));
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(T[] array, int low, int high) {

        T pivot = array[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            quickCompares++;
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                quickSwaps++;
            }
        }
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        quickSwaps++;
        return i + 1;
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {5, 2, 8, 1, 9, 3};
        Double[] arrayDouble = {1.2, 6.4, 3.5, 5.4};
        Float[] arrayFloat = {1f, 3.4f, 2.3f, 5f, 5f};

        SortExample<Integer> sorter1 = new SortExample<>();
        SortExample<Double> sorter2 = new SortExample<>();
        SortExample<Float> sorter3 = new SortExample<>();

        // Bubble Sort
        Integer[] arrayInt1 = arrayInt.clone();
        sorter1.bubbleSort(arrayInt1);
        System.out.println("Bubble Sort: " + Arrays.toString(arrayInt1));

        // Selection Sort
        Double[] arrayDouble1 = arrayDouble.clone();
        sorter2.selectionSort(arrayDouble1);
        System.out.println("Selection Sort: " + Arrays.toString(arrayDouble1));

        // Insertion Sort
        Float[] arrayFloat1 = arrayFloat.clone();
        sorter3.insertionSort(arrayFloat1);
        System.out.println("Insertion Sort: " + Arrays.toString(arrayFloat1));

        // Merge Sort
        Integer[] arrayInt2 = arrayInt.clone();
        sorter1.mergeSort(arrayInt2);
        System.out.println("Swaps: " + mergeSwaps);
        System.out.println("Compares: " + mergeCompares);
        System.out.println("Merge Sort: " + Arrays.toString(arrayInt2));

        // Quick Sort
        Double[] arrayDouble2 = arrayDouble.clone();
        sorter2.quickSort(arrayDouble2);
        System.out.println("Swaps: " + quickSwaps);
        System.out.println("Compares: " + quickCompares);
        System.out.println("Quick Sort: " + Arrays.toString(arrayDouble2));

    }
}