package g.dsa.hw3.ex1;

import java.util.*;

public class Test {
    private List<Fraction> fractions;

    public Test() {
        fractions = new LinkedList<Fraction>();
    }

    public Fraction getSecondLargestValue() {
        List<Fraction> list = sortByValue(fractions);
        if (list.size() > 0) {
            double maxValue = list.get(list.size() - 1).doubleValue();
            for (int i = list.size() - 1; i >= 0; i--) {
                if (Double.compare(list.get(i).doubleValue(), maxValue) != 0) {
                    return list.get(i);
                }
            }
            return null;
        }
        return null;
    }

    public static void print(List<Fraction> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }

    public static List<Fraction> sortByDenominator(List<Fraction> list) {
        List<Fraction> list0 = new LinkedList<>(list);
        Collections.sort(list0, new Comparator<Fraction>() {
            @Override
            public int compare(Fraction o1, Fraction o2) {
                return o1.getDenominator() - o2.getDenominator();
            }
        });
        return list0;
    }

    public static List<Fraction> sortByValue(List<Fraction> list) {
        List<Fraction> list0 = new LinkedList<>(list);
        Collections.sort(list0);
        return list0;
    }

    public static int createRandomNumber(int minValue, int maxValue) {
        int range = maxValue - minValue;
        return (int) (Math.random() * range + minValue);
    }

    public static Fraction createRandomFraction() {
        return new Fraction(
                createRandomNumber(1, 1000),
                createRandomNumber(1, 1000)
        );
    }

    public static Fraction sumOfAllFractions(List<Fraction> list) {

        Fraction sum = new Fraction(0);
        for (int i = 0; i < list.size(); i++) {
            sum = sum.add(list.get(i));
        }
        sum.normalize();
        return sum;
    }

    public static Fraction differenceOfAllFractions(List<Fraction> list) {
        Fraction difference = new Fraction(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            difference = (difference.minus(list.get(i)));
        }
        difference.normalize();
        return difference;
    }

    public static Fraction productOfAllFractions(List<Fraction> list) {
        Fraction product = new Fraction(1);
        for (int i = 0; i < list.size(); i++) {
            product = (product.multi(list.get(i)));
        }
        product.normalize();
        return product;
    }

    public static Fraction divisionOfAllFractions(List<Fraction> list) {
        Fraction division = new Fraction(list.get(0));
        for(int i = 1; i < list.size(); i++) {
            division = (division.divi(list.get(i)));
        }
        division.normalize();
        return division;
    }

    public static void main(String[] args) {
        Test testFraction = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many fractions: ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            System.out.print("Input numerator of fraction " + (i + 1) + ": ");
            int numerator = sc.nextInt();
            System.out.print("Input denominatorof fraction " + (i + 1) + ": ");
            int denominator = sc.nextInt();
            testFraction.fractions.add(new Fraction(numerator, denominator));
        }

        // Print fractions
        print(testFraction.fractions);
        System.out.println();

        Fraction sum = sumOfAllFractions(testFraction.fractions);
        System.out.println("sum = " + sum);

        Fraction division = divisionOfAllFractions(testFraction.fractions);
        System.out.println("division = " + division);

        Fraction difference  = differenceOfAllFractions(testFraction.fractions);
        System.out.println(" difference = " +  difference);

        Fraction product = productOfAllFractions(testFraction.fractions);
        System.out.println("product = " + product);


        // sort by value and print
        print(sortByValue(testFraction.fractions));

        // sort by value and print
        print(sortByDenominator(testFraction.fractions));

        // second largest value
        System.out.println(testFraction.getSecondLargestValue());
    }
}
