import java.util.HashSet;
public class duplicate {
    public static void main(String[] args){
        int[] nums={3,1,5,6,7,1};
        System.out.println(contains_dup(nums));
    }
    public static boolean contains_dup(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
            return true;
            set.add(nums[i]);
        }
        return false;
    }
}
