package g.dsa.hw6_21000691_doanducmanh.ex3;

public class InsertionSort implements SortInterface {

    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {

        int keyValue;
        int keyIdx;
        for (int i = 0; i < arr.length; i++) {
            keyValue = arr[i];
            keyIdx = i;
            while ((keyIdx > 0) && (arr[keyIdx - 1] > keyValue)) {
                arr[keyIdx] = arr[keyIdx - 1];
                keyIdx--;
            }
            arr[keyIdx] = keyValue;
        }
    }
}
