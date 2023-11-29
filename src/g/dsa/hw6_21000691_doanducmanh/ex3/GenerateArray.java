package g.dsa.hw6_21000691_doanducmanh.ex3;

import java.util.Random;

public class GenerateArray {

    private int n, seed;
    private int[] arr;

    public GenerateArray(int n, int seed) {
        this.n = n;
        this.seed = seed;
    }

    public int[] generate() {
        Random rand = new Random(seed);
        int max = 2 * n;
        arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = rand.nextInt(max);
        return arr;
    }

    public String toString() {
        String stringArr = "";
        for (int i=0; i<arr.length; i++) stringArr += arr[i] + ", ";
        return stringArr;
    }
}
