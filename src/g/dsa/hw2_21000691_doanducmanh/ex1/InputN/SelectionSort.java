package g.dsa.hw2_21000691_doanducmanh.ex1.InputN;

public class SelectionSort {
    public SelectionSort() {

    }

    static long swapCount = 0;
    static long compareCount = 0;

    public static void sort(int[] newArr) {
        for (int i = 0; i < newArr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[minIdx] > newArr[j]) {
                    minIdx = j;
                }
                compareCount++;
            }
            if (minIdx != i) {
                int temp = newArr[i];
                newArr[i] = newArr[minIdx];
                newArr[minIdx] = temp;
                swapCount++;
            }
        }
    }
}
