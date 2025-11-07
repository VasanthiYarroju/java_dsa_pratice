public class reverseWordsinString {
    public String reverseWords(String s){
        char[] chars=s.toCharArray();
        int n=chars.length,start=0;
        for(int end=0;end<=n;end++){
            if(end==n || chars[end]==' '){
                reverse(chars,start,end-1);
                start=end+1;
            }
        }
        return new String(chars);
    }
    public void reverse(char[] chars,int left,int right){
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        reverseWordsinString rw = new reverseWordsinString();
        String s = "Hello World from Java";
        String result = rw.reverseWords(s);
        System.out.println(result);
    }
}