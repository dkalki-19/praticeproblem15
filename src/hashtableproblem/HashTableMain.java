package hashtableproblem;

public class HashTableMain {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable<>(10);
        
     // UC1: Word frequency for sentence
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) count = 0;
            hashTable.add(word, count + 1);
        }

        System.out.println("UC1 - Word Frequencies: " + hashTable);
    }
}
