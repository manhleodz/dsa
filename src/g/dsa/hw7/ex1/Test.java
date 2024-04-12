package g.dsa.hw7.ex1;

public class Test {

    public static void main(String[] args) {
        SimpleArrayList simpleArrayList = new SimpleArrayList<>();
        int[] arr1 = generate(10);
        for (int i : arr1) {
            simpleArrayList.add(i);
        }

        for (Object i : simpleArrayList) {
            System.out.print(i + " ");
        }

        System.out.println("\nHas 11: " + simpleArrayList.search(11));
    }

    public static int[] generate(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
