package module13;
class MaxNode {
    int data;
    Node left, right;

    MaxNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTMinMax {

    Node root;

    // Find Minimum
    int findMin(Node root) {
        if (root == null)
            return -1;

        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find Maximum
    int findMax(Node root) {
        if (root == null)
            return -1;

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();

        // Creating BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.println("Minimum value: " + tree.findMin(tree.root));
        System.out.println("Maximum value: " + tree.findMax(tree.root));
    }
}
