package BST;

class Node<T extends Comparable<T>> {
    T key;
    Node<T> left, right;

    public Node(T item) {
        key = item;
        left = right = null;
    }
}
