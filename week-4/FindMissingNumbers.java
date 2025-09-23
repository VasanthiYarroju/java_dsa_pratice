import java.util.*;

public class FindMissingNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // First pass: mark indices as visited by negating
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        // Second pass: collect indices that are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Make a copy if you want to show original array after mutation
        int[] copy = Arrays.copyOf(nums, nums.length);

        System.out.println("Original array: " + Arrays.toString(copy));
        List<Integer> missing = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + missing);
    }
}
