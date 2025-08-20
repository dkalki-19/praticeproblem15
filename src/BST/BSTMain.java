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
        
     // UC2 - Insert 13 elements
        int[] elements = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for (int el : elements) {
            bst.insert(el);
        }

        System.out.print("UC2 - Inorder Traversal: ");
        bst.inorder();  // Output will be sorted order of inserted elements
    }
   
}
