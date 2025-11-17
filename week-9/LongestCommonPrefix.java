public class LongestCommonPrefix{
    public static String longestcommonprefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        String first=strs[0];
        StringBuilder prefix=new StringBuilder();
        for(int i=0;i<first.length();i++){
            char c=first.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();

    }
    public static void main(String[] args){
        String[] strs={"flower","flow","flight"};
        System.out.println(longestcommonprefix(strs));
    }
}