package module13;
class CheckNode {
    int data;
    Node left, right;

    CheckNode(int value) {
        data = value;
        left = right = null;
    }
}

public class CheckBST {

    // Function to check BST
    boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();

        // Creating binary tree
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        if (tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}


