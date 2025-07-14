import java.util.*;

public class RemoveAnagrams {
    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (!result.isEmpty() && isAnagram(word, result.get(result.size() - 1))) {
                continue; // skip the word if it's an anagram of the previous one
            }
            result.add(word);
        }

        return result;
    }

    private static boolean isAnagram(String a, String b) {
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) freq[c - 'a']--;
        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        List<String> result = removeAnagrams(words);
        System.out.println(result); // Output: [abba, cd]
    }
}
