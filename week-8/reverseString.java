public class reverseString {
    public void reversestring(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        reverseString rs = new reverseString();
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        rs.reversestring(str);
        System.out.println(str);
    }
}
