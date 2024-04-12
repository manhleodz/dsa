package g.dsa.hw5.ex1.linked;


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LinkedBinaryTree<String, LinkedBinaryTree.Node<String>> tree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<String> root = tree.addRoot("A");
        LinkedBinaryTree.Node<String> nodeB = tree.addLeft(root, "B");
        LinkedBinaryTree.Node<String> nodeC = tree.addRight(root, "C");
        LinkedBinaryTree.Node<String> nodeD = tree.addLeft(nodeB, "D");
        LinkedBinaryTree.Node<String> nodeE = tree.addRight(nodeB, "E");
        LinkedBinaryTree.Node<String> nodeF = tree.addLeft(nodeC, "F");
        LinkedBinaryTree.Node<String> nodeG = tree.addRight(nodeC, "G");

        // Vẽ cây và lưu vào tệp văn bản
        String treeDrawing = drawBinaryTree(root);
        System.out.println(treeDrawing);
        saveToFile("output.txt", treeDrawing);

        System.out.println("Tree is empty: " + tree.isEmpty());
        System.out.println("Size of tree: " + tree.size());
        System.out.println("Numchildren of root: " + tree.numChildren(root));
        System.out.println("Numchildren of G: " + tree.numChildren(nodeG));
        System.out.println("Root element: " + tree.root().getElement());
        System.out.println("Left of root: " + root.getLeft().getElement());
        System.out.println("Right of root: " + root.getRight().getElement());
        System.out.println("Left of B: " + nodeB.getLeft().getElement());
        System.out.println("Parent of F: " + tree.parent(root));
    }

    public static String drawBinaryTree(LinkedBinaryTree.Node<String> root) {
        StringBuilder treeDrawing = new StringBuilder();
        drawNode(root, treeDrawing, 0);
        return treeDrawing.toString();
    }

    private static void drawNode(LinkedBinaryTree.Node<String> node, StringBuilder treeDrawing, int depth) {
        if (node == null) {
            return;
        }

        drawNode(node.getRight(), treeDrawing, depth + 1);

        for (int i = 0; i < depth; i++) {
            treeDrawing.append("   ");
        }
        treeDrawing.append(node.getElement()).append("\n");

        drawNode(node.getLeft(), treeDrawing, depth + 1);
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
