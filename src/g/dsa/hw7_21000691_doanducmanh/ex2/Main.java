package g.dsa.hw7_21000691_doanducmanh.ex2;

class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer, LinkedBinaryTree.Node<Integer>> bst = new BinarySearchTree<>();

        int[] arr1 = generate(10);
        for (int i : arr1) {
            bst.insert(i);
        }

        System.out.println("Cây theo thứ tự trung tố:");
        inorder(bst.root);
        System.out.println();

        System.out.println("Phần tử nhỏ nhất trên cây là: " + bst.findMin());

        System.out.println("Có phần tử 40 trên cây? " + bst.search(40));
        System.out.println("Có phần tử 90 trên cây? " + bst.search(90));
    }

    public static int[] generate(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * Math.pow(10,6));
        }
        return arr;
    }

    private static void inorder(LinkedBinaryTree.Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        System.out.print(node.element + " ");

        inorder(node.right);
    }
}
