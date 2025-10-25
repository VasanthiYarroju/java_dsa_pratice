public class valid_palindrome {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanedString.length() - 1;
        
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        valid_palindrome vp = new valid_palindrome();
        String testString = "A man, a plan, a canal: Panama";
        System.out.println(vp.isPalindrome(testString));
    }
    
}
