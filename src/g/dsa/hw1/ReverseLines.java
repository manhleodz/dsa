package g.dsa.hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Enter lines of text :");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        System.out.println("Reversed lines:");

        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        scanner.close();
    }
}
