import java.util.*;
public class GroupOfAnagrams{
    public static void main(String [] args){
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(str);
        for (List<String> list : result) {
            System.out.println(list);
        }

    }
}
class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedWord=new String(ch);
            map.computeIfAbsent(sortedWord,k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
