package module12;
class PreNode {
    int data;
    Node left, right;

    PreNode(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTreePreorder {
    void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        BinaryTreePreorder tree = new BinaryTreePreorder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Preorder Traversal: ");
        tree.preorder(root);
    }
}

