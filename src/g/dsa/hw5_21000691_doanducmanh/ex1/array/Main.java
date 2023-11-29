package g.dsa.hw5_21000691_doanducmanh.ex1.array;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ArrayBinaryTree
        LinkedBinaryTree<String, String> binaryTree = new LinkedBinaryTree<>();

        // Set the root element
        binaryTree.setRoot("A");

        // Set left and right children of the root
        binaryTree.setLeft(1, "B");
        binaryTree.setRight(1, "C");
        binaryTree.setLeft(2, "D");
        binaryTree.setRight(2, "E");
        binaryTree.setLeft(3, "F");
        binaryTree.setRight(3, "G");
        binaryTree.setLeft(4, "H");
        binaryTree.setRight(4, "I");
        binaryTree.setLeft(5, "K");

        System.out.println(binaryTree);

        String drawing = drawBinaryTree(binaryTree);
        System.out.println(drawing);
        saveToFile("array.txt", drawing);


        // Get and display the root element
        String root = binaryTree.root();
        System.out.println("Root: " + root);

        // Get and display the size of the tree
        int size = binaryTree.size();
        System.out.println("Size: " + size);

        // Check if the tree is empty
        boolean isEmpty = binaryTree.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        // Get and display the number of children of element "B"
        int numChildren = binaryTree.numChildren("B");
        System.out.println("Number of children of B: " + numChildren);

        // Get and display the parent of element "C"
        String parent = binaryTree.parent("C");
        System.out.println("Parent of C: " + parent);

        // Get and display the left child of element "A"
        String leftChild = binaryTree.left("A");
        System.out.println("Left child of A: " + leftChild);

        // Get and display the right child of element "A"
        String rightChild = binaryTree.right("A");
        System.out.println("Right child of A: " + rightChild);

        // Get and display the sibling of element "B"
        String sibling = binaryTree.sibling("B");
        System.out.println("Sibling of B: " + sibling);
    }

    public static <E, T> String drawBinaryTree(LinkedBinaryTree<E, T> binaryTree) {
        StringBuilder treeDrawing = new StringBuilder();
        drawBinaryTree(binaryTree.root(), binaryTree, treeDrawing, 1);
        return treeDrawing.toString();
    }

    private static <E, T> void drawBinaryTree(T node, LinkedBinaryTree<E, T> binaryTree, StringBuilder treeDrawing, int level) {
        if (node != null) {
            // Draw the right child
            drawBinaryTree(binaryTree.right(node), binaryTree, treeDrawing, level + 1);

            // Print the node value with appropriate indentation
            for (int i = 0; i < level - 1; i++) {
                treeDrawing.append("    ");
            }
            treeDrawing.append(node).append("\n");

            // Draw the left child
            drawBinaryTree(binaryTree.left(node), binaryTree, treeDrawing, level + 1);
        }
    }

    public static void saveToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Tree diagram saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
