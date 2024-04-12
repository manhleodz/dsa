package g.dsa.hw2.ex9;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of students: ");
        int N = sc.nextInt();
        if (N <= Math.pow(10, 5) && N >= 1) {
            System.out.print("original position of Tí: ");
            int T = sc.nextInt();
            if (T > N || T < 0) {
                System.out.println("Wrong Position!!!");
            } else {
                int[] arr = new int[N];
                System.out.print("Enter student heights: ");
                for (int i = 0; i < N; i++) {

                    arr[i] = sc.nextInt();
                    if (arr[i] < 0 || arr[i] > Math.pow(10, 9)) {
                        System.out.println("Wrong value!!");
                        break;
                    }
                }
                sc.close();

                int height = arr[T - 1];
                int[] newArr = increasing(arr.clone());
                for (int i = 0; i < newArr.length; i++) {
                    if (newArr[i] == height) {
                        System.out.println("New position of Tí: " + (i + 1));
                    }
                }
            }

        } else {
            System.out.println("Wrong number!!!");
        }
    }

    public static int[] increasing(int[] newArr) {
        for (int i = 0; i < newArr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[minIdx] > newArr[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = newArr[i];
                newArr[i] = newArr[minIdx];
                newArr[minIdx] = temp;
            }
        }
        return newArr;
    }

}
