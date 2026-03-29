package module12;
class PostNode {
    int data;
    Node left, right;
    PostNode(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTreePostorder {
    void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);    // Visit left subtree
        postorder(root.right);   // Visit right subtree
        System.out.print(root.data + " "); // Visit root
    }
    public static void main(String[] args) {
        BinaryTreePostorder tree = new BinaryTreePostorder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Postorder Traversal: ");
        tree.postorder(root);
    }
}