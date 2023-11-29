package g.dsa.hw2_21000691_doanducmanh.ex1.InputArray;

import java.util.Arrays;

public class BubbleSort {
    public BubbleSort() {

    }

    static int swapCount = 0;
    static int compareCount = 0;

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                compareCount++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
