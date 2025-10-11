import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, 1);  // base case

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            // Check if there's a prefix with sum = currentSum - k
            if (seen.containsKey(sum - k)) {
                
            }

            // Store/update current prefix sum frequency
            seen.put(sum, seen.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

public class  SubArraySumK{
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3};
        int k = 3;

        int result = sol.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum = " + k + " → " + result);
    }
}
