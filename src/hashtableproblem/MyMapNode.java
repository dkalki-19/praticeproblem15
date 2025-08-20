package hashtableproblem;

public class MyMapNode<K, V> {
    K key;
    V value;
    MyMapNode<K, V> next; // For LinkedList chaining

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "{" + key + "=" + value + "}";
    }
}

