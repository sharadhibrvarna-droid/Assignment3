package module13;
class BSTNode {
    int data;
    Node left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}
public class BinarySearch {
    Node root;
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearch tree = new BinarySearch();

        // Creating BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);

        int key = 40;

        if (tree.search(tree.root, key))
            System.out.println("Key found");
        else
            System.out.println("Key not found");
    }
}

