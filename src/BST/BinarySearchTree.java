package BST;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert method
    public void insert(T key) {
        root = insertRec(root, key);
    }

    private Node<T> insertRec(Node<T> root, T key) {
        if (root == null) {
            root = new Node<>(key);
            return root;
        }
        if (key.compareTo(root.key) < 0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);
        return root;
    }

    // Inorder traversal
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    
    public boolean search(T key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node<T> root, T key) {
        if (root == null) return false;
        if (root.key.equals(key)) return true;
        if (key.compareTo(root.key) < 0)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }
}
