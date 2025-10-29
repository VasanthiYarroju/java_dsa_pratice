import java.util.Arrays;
public class LHS {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {1, 1, 1, 1};
        int[] nums5 = {};

        System.out.println("Test 1: " + longestHarmoniousSubsequence(nums1)); 
        System.out.println("Test 2: " + longestHarmoniousSubsequence(nums2)); 
        System.out.println("Test 3: " + longestHarmoniousSubsequence(nums3)); 
        System.out.println("Test 4: " + longestHarmoniousSubsequence(nums4)); 
        System.out.println("Test 5: " + longestHarmoniousSubsequence(nums5)); 
        
    }
    public static int longestHarmoniousSubsequence(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,longest=0;
        for(int j=0;j<n;j++){
            while(nums[j]-nums[i]>1){
                i++;
            }
        if(nums[j]-nums[i]==1){
            longest=Math.max(longest,j-i+1);
        }
    }
        return longest;
    
    }
}