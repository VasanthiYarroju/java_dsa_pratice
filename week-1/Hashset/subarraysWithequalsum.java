import java.util.*;

public class subarraysWithequalsum {
    public static void main(String[] args) {
        subarraysWithequalsum s = new subarraysWithequalsum();
        int[] arr = {1, 2, 3, 2};
        boolean result = s.subArrays(arr);
        System.out.println(result);  // Output: true
    }



    public boolean subArrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
