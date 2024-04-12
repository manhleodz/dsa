package g.dsa.hw5.ex2;

import g.dsa.hw5.ex1.linked.LinkedBinaryTree;


public class Test {

    public static void main(String[] args) {
        LinkedBinaryTree<String, LinkedBinaryTree.Node<String>> tree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<String> root = tree.addRoot("+");
        LinkedBinaryTree.Node<String> nodeB = tree.addLeft(root, "*");
        LinkedBinaryTree.Node<String> nodeC = tree.addRight(root, "*");
        LinkedBinaryTree.Node<String> nodeD = tree.addLeft(nodeB, "/+");
        LinkedBinaryTree.Node<String> nodeE = tree.addRight(nodeB, "/");
        LinkedBinaryTree.Node<String> nodeF = tree.addLeft(nodeD, "5");
        LinkedBinaryTree.Node<String> nodeG = tree.addRight(nodeD, "2");
        LinkedBinaryTree.Node<String> nodeH = tree.addLeft(nodeE, "-");
        LinkedBinaryTree.Node<String> nodeI = tree.addRight(nodeE, "+");
        LinkedBinaryTree.Node<String> nodeK = tree.addLeft(nodeH, "2");
        LinkedBinaryTree.Node<String> nodeL = tree.addRight(nodeH, "1");
        LinkedBinaryTree.Node<String> nodeN = tree.addLeft(nodeI, "2");
        LinkedBinaryTree.Node<String> nodeM = tree.addRight(nodeI, "9");
        LinkedBinaryTree.Node<String> nodeO = tree.addLeft(nodeC, "-");
        LinkedBinaryTree.Node<String> nodeP = tree.addRight(nodeC, "8");
        LinkedBinaryTree.Node<String> nodeQ = tree.addLeft(nodeO, "-");
        LinkedBinaryTree.Node<String> nodeR = tree.addRight(nodeO, "1");
        LinkedBinaryTree.Node<String> nodeS = tree.addLeft(nodeQ, "7");
        LinkedBinaryTree.Node<String> nodeT = tree.addRight(nodeQ, "2");


        String treeDrawing = drawBinaryTree(root);
        System.out.println(treeDrawing);

        ExpressionTree helo = new ExpressionTree();

        System.out.print("Infix: ");
        helo.inorderPrint(tree.root());

        System.out.print("\nPostfix: ");
        helo.postorderPrint(tree.root());

        System.out.print("\nPrefix: ");
        helo.preorderPrint(tree.root());

        System.out.println("\nResult = " + evaluate(tree.root()));
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

    public static float evaluate(LinkedBinaryTree.Node<String> node) {
        if (node.getLeft() == null) {
            return Float.parseFloat(node.getElement());
        }
        else {
            float x = evaluate(node.getLeft());
            float y = evaluate(node.getRight());
            float z = 0;
            switch (node.getElement()) {
                case "+" :
                    z = x + y;
                    break;

                case "-" :
                    z = x - y;
                    break;

                case "/" :
                    z = x / y;
                    break;

                case "*":
                    z = x * y;
                    break;
            }
            return z;
        }
    }
}
