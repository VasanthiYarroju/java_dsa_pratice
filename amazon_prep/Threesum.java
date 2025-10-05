import java.util.*;

public class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums);  // sort the array

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i
            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // found a triplet
                    resultSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        Threesum sol = new Threesum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = sol.threeSum(nums);

        System.out.println("Unique triplets that sum to 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
