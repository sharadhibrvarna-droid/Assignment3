package module13;
class DeleteNode {
    int data;
    Node left, right;

    DeleteNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTDeletion {

    Node root;

    // Find minimum (inorder successor)
    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Delete function
    Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1 & 2: one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: two children
            root.data = findMin(root.right); // replace with successor
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTDeletion tree = new BSTDeletion();

        // Creating BST
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.print("Before Deletion: ");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 50);

        System.out.print("\nAfter Deletion: ");
        tree.inorder(tree.root);
    }
}
