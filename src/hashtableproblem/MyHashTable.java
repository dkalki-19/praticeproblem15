package hashtableproblem;

import java.util.ArrayList;

public class MyHashTable<K, V> {
    private final int bucketSize;
    private ArrayList<MyLinkedList<K, V>> bucketArray;

    public MyHashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        bucketArray = new ArrayList<>(bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % bucketSize;
    }

    // Add or update key-value
    public void add(K key, V value) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> linkedList = bucketArray.get(index);

        if (linkedList == null) {
            linkedList = new MyLinkedList<>();
            bucketArray.set(index, linkedList);
        }

        MyMapNode<K, V> node = linkedList.search(key);
        if (node == null) {
            linkedList.append(new MyMapNode<>(key, value));
        } else {
            node.value = value; // update
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> linkedList = bucketArray.get(index);
        if (linkedList == null) return null;

        MyMapNode<K, V> node = linkedList.search(key);
        return (node != null) ? node.value : null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<K, V> linkedList = bucketArray.get(index);
        if (linkedList != null) {
            linkedList.remove(key);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MyLinkedList<K, V> list : bucketArray) {
            if (list != null) {
                sb.append(list.toString());
            }
        }
        return sb.toString();
    }
}
