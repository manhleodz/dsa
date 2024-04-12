package g.gk.detest.bt3;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer, BinaryTree.Node> tree = new BinaryTree<>();
        BinaryTree.Node<Integer> root = tree.addRoot(1);
        BinaryTree.Node<Integer> node2 = tree.addLeft(root, 2);
        BinaryTree.Node<Integer> node3 = tree.addRight(root, 3);
        BinaryTree.Node<Integer> node4 = tree.addLeft(node2, 4);
        BinaryTree.Node<Integer> node5 = tree.addRight(node2, 5);

        String treeDrawing = drawBinaryTree(root);
        System.out.println(treeDrawing);
        System.out.println(tree.getLongestPath(root, root, node2));
        System.out.println();

        tree.covertMirror(root);
        String treeDrawing1 = drawBinaryTree(root);
        System.out.println(treeDrawing1);
    }

    public static String drawBinaryTree(BinaryTree.Node<Integer> root) {
        StringBuilder treeDrawing = new StringBuilder();
        drawNode(root, treeDrawing, 0);
        return treeDrawing.toString();
    }

    private static void drawNode(BinaryTree.Node<Integer> node, StringBuilder treeDrawing, int depth) {
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
}
