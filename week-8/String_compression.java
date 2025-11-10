public class String_compression {
    public static int compress(char[] chars){
        int n=chars.length;
        int write=0,end=0;
        while(end<n){
            char current=chars[end];
            int count=0;
            while(end<n && chars[end]==current){
                end++;
                count++;
            }
            chars[write++]=current;
            if(count>1){
                String countStr=String.valueOf(count);
                for(char c:countStr.toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = compress(chars);
        System.out.println("Compressed length: " + newLength);
        System.out.print("Compressed array: ");
        for(int i=0; i<newLength; i++){
            System.out.print(chars[i]);
        }
    }
}
