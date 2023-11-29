package g.dsa.hw3_21000691_doanducmanh.ex2;

public class Test {

    public static void main(String[] args) {

        ListInterface<Integer> list = new SimpleArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size: " + list.size());

        System.out.print("Elements: ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Element at index 2: " + list.get(2));

        list.set(1, 50);
        System.out.println("Updated element at index 1: " + list.get(1));

        System.out.println("Contains 30: " + list.isContain(30));
        System.out.println("Contains 60: " + list.isContain(60));

        list.remove(30);
        System.out.println("Size after removing: " + list.size());
        System.out.println("Contains 30 after removing: " + list.isContain(30));

        System.out.println("Is empty: " + list.isEmpty());

        list.remove(10);
        list.remove(20);
        list.remove(40);
        System.out.println("Size after removing all elements: " + list.size());
        System.out.println("Is empty after removing all elements: " + list.isEmpty());
    }
}
