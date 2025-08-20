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
        
        
     // UC2: Paragraph frequency
        String paragraph = "Paranoids are not paranoid because they are paranoid but because "
                + "they keep putting themselves deliberately into paranoid avoidable situations";
        String[] paraWords = paragraph.toLowerCase().split(" ");

        MyHashTable<String, Integer> paraTable = new MyHashTable<>(20);

        for (String word : paraWords) {
            Integer count = paraTable.get(word);
            if (count == null) count = 0;
            paraTable.add(word, count + 1);
        }  

        System.out.println("UC2 - Paragraph Frequencies: " + paraTable);

    }
}
