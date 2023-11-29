package g.dsa.hw7_21000691_doanducmanh.ex4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(3, 6));
        points.add(new Point(17, 15));
        points.add(new Point(13, 15));
        points.add(new Point(6, 12));
        points.add(new Point(9, 1));
        points.add(new Point(2, 7));
        RangeSearchIn2D kdTree = new RangeSearchIn2D(points);
        Point topLeft = new Point(5, 5);
        Point bottomRight = new Point(15, 14);
        List<Point> result = kdTree.rangeSearch(topLeft, bottomRight);
        System.out.println("Points in the range:");
        for (Point p : result) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
}

