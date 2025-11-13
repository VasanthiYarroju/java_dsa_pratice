public class Reverse_within_String {
    public static String reverseString(String s){
        s.toLowerCase();
        char[] chars=s.toCharArray();
        int n=chars.length;
        int start=0;
        for(int end=0;end<=n;end++){
            if(end==n || chars[end]==' '){
                reverse(chars,start,end-1);
                start=end+1;
            }
        }
        return new String(chars);
    }
    public static void reverse(char[] chars,int left,int right){
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
    }
}
