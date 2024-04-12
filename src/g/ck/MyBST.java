package g.ck;

public class MyBST {
    private TreeNode myRoot;

    public MyBST() {
        myRoot = null;
    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insertIntoBST(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else{
                insertIntoBST(root.right, value);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        MyBST myBST = new MyBST();

        test2(myBST);
    }

    public static void test1(MyBST myBST) {
        myBST.myRoot = myBST.insert(myBST.myRoot, 5);
        myBST.myRoot = myBST.insert(myBST.myRoot, 1);
        myBST.myRoot = myBST.insert(myBST.myRoot, 6);
        myBST.myRoot = myBST.insert(myBST.myRoot, 0);
        myBST.myRoot = myBST.insert(myBST.myRoot, 3);
        myBST.myRoot = myBST.insert(myBST.myRoot, 7);
        myBST.myRoot = myBST.insert(myBST.myRoot, 2);
        myBST.myRoot = myBST.insert(myBST.myRoot, 4);

        System.out.println("Done");
    }

    public static void test2(MyBST myBST) {
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 5);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 1);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 6);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 0);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 3);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 7);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 2);
        myBST.myRoot = myBST.insertIntoBST(myBST.myRoot, 4);

        System.out.println("Done");
    }
}
