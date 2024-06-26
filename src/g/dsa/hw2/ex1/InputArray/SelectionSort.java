package g.dsa.hw2.ex1.InputArray;

import java.util.Arrays;

public class SelectionSort {
    public SelectionSort() {

    }

    static int swapCount = 0;
    static int compareCount = 0;

    public static void sort(int[] newArr) {
        for ( int i = 0 ; i < newArr.length - 1 ; i++ ) {
            int minIdx = i;
            for ( int j = i + 1 ; j < newArr.length ; j++ ) {
                if (newArr[minIdx] > newArr[j]) {
                    minIdx = j;
                }
                compareCount++;
            }
            if (minIdx != i) {
                int temp = newArr[i];
                System.out.println(Arrays.toString(newArr));
                newArr[i] = newArr[minIdx];
                newArr[minIdx] = temp;
                swapCount++;
            }
        }
    }
}
