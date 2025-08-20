package hashtableproblem;

public class MyLinkedList<K, V> {
    MyMapNode<K, V> head;

    // Search node by key
    public MyMapNode<K, V> search(K key) {
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add node at end
    public void append(MyMapNode<K, V> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            MyMapNode<K, V> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Remove node by key
    public void remove(K key) {
        MyMapNode<K, V> temp = head;
        MyMapNode<K, V> prev = null;

        while (temp != null && !temp.key.equals(key)) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // not found

        if (prev == null) { // key is at head
            head = temp.next;
        } else {
            prev.next = temp.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            sb.append(temp.toString()).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
