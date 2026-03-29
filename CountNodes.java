package module12;
class NumberNode {
    int data;
    Node left, right;
    NumberNode(int value) {
        data = value;
        left = right = null;
    }
}
public class CountNodes {
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        CountNodes tree = new CountNodes();

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Total number of nodes: " + tree.countNodes(root));
    }
}

