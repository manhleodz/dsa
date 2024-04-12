package g.dsa.hw2.ex1.InputN;

public class InsertionSort {
    public InsertionSort() {

    }

    static long swapCount = 0;
    static long compareCount = 0;

    public static void sort(int[] newArr) {

        int keyValue;
        int keyIdx;
        for (int i = 0; i < newArr.length; i++) {
            keyValue = newArr[i];
            keyIdx = i;
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
