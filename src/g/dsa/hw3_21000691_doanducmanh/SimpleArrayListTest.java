package g.dsa.hw3_21000691_doanducmanh;

public class SimpleArrayListTest {
    public static void main(String[] args) {

        // Create a SimpleArrayList object
        SimpleArrayList<Integer> list = new SimpleArrayList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the initial list
        System.out.println("Initial list:");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Check if element 3 exists in the list
        int elementToCheck = 3;
        boolean containsElement = list.isContain(elementToCheck);
        System.out.println("Element " + elementToCheck + " exists in the list: " + containsElement);

        // Get element 2 and set it to 6
        int indexToSet = 1;
        int newValue = 6;
        list.set(indexToSet, newValue);

        // Print the list after modification
        System.out.println("List after modification:");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Remove element 4 from the list
        int elementToRemove = 4;
        list.remove(1);
        list.remove(6);
        list.remove(3);
        list.remove(5);
        list.remove(4);

        // Print the list after removal
        System.out.println("List after removal:");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Check the size of the list and whether it is empty
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        System.out.println("Size of the list: " + size);
        System.out.println("Is the list empty: " + isEmpty);
    }
}

