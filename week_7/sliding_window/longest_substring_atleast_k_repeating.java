public class longest_substring_atleast_k_repeating {
    public static int longestSubstring(String s, int k){
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']<k){
                int left=longestSubstring(s.substring(0,i), k);
                int right=longestSubstring(s.substring(i+1,n), k);
                return Math.max(left, right);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        String s1 = "aaabb";
        int k1 = 3;
        System.out.println("Test 1: " + longestSubstring(s1, k1)); // Output: 3

        String s2 = "ababbc";
        int k2 = 2;
        System.out.println("Test 2: " + longestSubstring(s2, k2)); // Output: 5

        String s3 = "aabbbcccc";
        int k3 = 3;
        System.out.println("Test 3: " + longestSubstring(s3, k3)); // Output: 7

        String s4 = "abcd";
        int k4 = 2;
        System.out.println("Test 4: " + longestSubstring(s4, k4)); // Output: 0

        String s5 = "aaabbbccddeee";
        int k5 = 3;
        System.out.println("Test 5: " + longestSubstring(s5, k5)); // Output: 6
    }
}
