package g.dsa.hw2_21000691_doanducmanh.ex1.InputArray;

import java.util.Arrays;

public class InsertionSort {
    public InsertionSort() {

    }

    static int swapCount = 0;
    static int compareCount = 0;

    public static void sort(int[] newArr) {

        int keyValue;
        int keyIdx;
        for (int i = 0; i < newArr.length; i++) {
            keyValue = newArr[i];
            keyIdx = i;
            System.out.println(Arrays.toString(newArr));
            while ((keyIdx > 0) && (newArr[keyIdx - 1] > keyValue)) {
                newArr[keyIdx] = newArr[keyIdx - 1];
                compareCount++;
                swapCount++;
                keyIdx--;
            }
            newArr[keyIdx] = keyValue;
            compareCount++;
        }
    }
}
