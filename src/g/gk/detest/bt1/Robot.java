package g.gk.detest.bt1;

public class Robot {

    public static void main(String[] args) {
        int M = 4;
        int N = 2;
        int t = 2;

        System.out.println(countPath(M, N , t));
    }

    public static int countPath(int M, int N, int t) {
        int[][] matrix = new int[M][N];
        return 2 * M + N - 2;
    }
}
