import java.util.HashSet;
import java.util.Set;

public class PerminString {

    // Function to generate all permutations of s1
    public static Set<String> generatePermutations(String s) {
        Set<String> perms = new HashSet<>();
        if (s == null) return perms;
        if (s.length() == 0) {
            perms.add("");
            return perms;
        }

        char first = s.charAt(0);
        String remainder = s.substring(1);
        Set<String> words = generatePermutations(remainder);

        for (String w : words) {
            for (int i = 0; i <= w.length(); i++) {
                perms.add(w.substring(0, i) + first + w.substring(i));
            }
        }
        return perms;
    }

    // Check if any permutation of s1 is a substring of s2
    public static boolean containsPermutation(String s1, String s2) {
        Set<String> permutations = generatePermutations(s1);
        for (String perm : permutations) {
            if (s2.contains(perm)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cbadefg";
        System.out.println(containsPermutation(s1, s2));  // Output: true
    }
}
