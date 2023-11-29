package g.dsa.hw2_21000691_doanducmanh.ex1.InputN;

public class BubbleSort {

    public BubbleSort() {

    }

    static long swapCount = 0;
    static long compareCount = 0;

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                compareCount++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount++;
                }
            }
        }
    }
}
