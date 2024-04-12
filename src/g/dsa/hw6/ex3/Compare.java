package g.dsa.hw6.ex3;

public class Compare {

    public static void judge(int[] arr, int sign) {
        SortInterface sortAlgo = null;

        if (sign == 1) {
            sortAlgo = new SelectionSort(arr);
        } else if (sign == 2) {
            sortAlgo = new MergeSort(arr);
        } else if (sign == 3) {
            sortAlgo = new QuickSort(arr);
        } else if (sign == 4) {
            if (arr.length >= 1000) sortAlgo = new HeapSort(arr, arr.length + 1);
            else sortAlgo = new HeapSort(arr);
        } else if (sign == 5) {
            sortAlgo = new BubbleSort(arr);
        } else if (sign == 6) {
            sortAlgo = new InsertionSort(arr);
        } else {
            System.out.println("Algorithm is invalid!!");
        }

        long startTime = System.currentTimeMillis();
        sortAlgo.sort();
        long elapsedTime = System.currentTimeMillis() - startTime;

        String messageOut = String.format("%s: %d", sortAlgo.getClass().getSimpleName(), elapsedTime);
        System.out.println(messageOut);
    }

    public static void main(String[] args) {
        int seed = 36;
        int numAlgo = 6;
        int[] sizes = {1000, 10000, 100000, 1000000};

        // Measure
        for (int size : sizes) {
            System.out.println("SAMPLE SIZE - " + size);
            for (int i = 1; i <= numAlgo; i++) {
                GenerateArray generate = new GenerateArray(size, seed);
                int[] arr = generate.generate();
                judge(arr, i);
            }
            System.out.println("---------------------------------\n\n");
        }
    }
}
