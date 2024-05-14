package generics.generics_pt_2;
//to be copied
import java.util.*;

public class MostOccurringWords {

    public static List<String> findMostOccurringWords(String input) {
        String[] words = input.split("\\s+");
        Hashtable<String, Integer> wordFreq = new Hashtable<>();

        // Count frequency of each word
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Find max frequency
        int maxFreq = 0;
        for (int freq : wordFreq.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Find words with max frequency
        List<String> mostOccurringWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                mostOccurringWords.add(entry.getKey());
            }
        }

        return mostOccurringWords;
    }

    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        List<String> mostOccurringWords = findMostOccurringWords(input);
        System.out.println("Most occurring words in the string:");
        for (String word : mostOccurringWords) {
            System.out.println(word);
        }
    }
}

