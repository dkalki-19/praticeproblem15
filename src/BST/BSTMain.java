package BST;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC1 - Create BST and add elements
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        System.out.print("UC1 - Inorder Traversal: ");
        bst.inorder();  // Output: 30 56 70
    }
}
