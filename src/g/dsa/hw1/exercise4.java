package g.dsa.hw1;

import java.util.Scanner;

public class exercise4 {
    double x, y, z, r;

    public exercise4(double r, double x, double y, double z) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double getSurfaceArea() {
        return 4 * Math.PI * r * r;
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * r * r * r;
    }

    public static boolean isInside(exercise4 s1, exercise4 s2) {
        double distance = Math.sqrt(Math.pow(s1.x - s2.x, 2) + Math.pow(s1.y - s2.y, 2) + Math.pow(s1.z - s2.z, 2));
        return distance + s2.r <= s1.r;
    }

    public static boolean isIntersecting(exercise4 s1, exercise4 s2) {
        double distance = Math.sqrt(Math.pow(s1.x - s2.x, 2) + Math.pow(s1.y - s2.y, 2) + Math.pow(s1.z - s2.z, 2));
        return distance <= s1.r + s2.r;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius and coordinate of the center of the first sphere: ");
        exercise4 s1 = new exercise4(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println("Enter radius and coordinate of the center of the second sphere: ");
        exercise4 s2 = new exercise4(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        input.close();

        System.out.println("The surface area of the first sphere is: " + s1.getSurfaceArea());
        System.out.println("The surface area of the second sphere is: " + s2.getSurfaceArea());
        System.out.println("The volume of the first sphere is: " + s1.getVolume());
        System.out.println("The volume of the second sphere is: " + s2.getVolume());

        if (isInside(s1, s2)) {
            System.out.println("The second sphere is inside the first one: ");
        } else if (isIntersecting(s1, s2)) {
            System.out.println("The spheres do intersect");
        } else {
            System.out.println("The spheres do not intersect");
        }
    }

}


