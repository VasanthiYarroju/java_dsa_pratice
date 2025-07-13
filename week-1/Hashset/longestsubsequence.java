import java.util.HashSet;

public class longestsubsequence {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {
            // Only start if num is the start of the sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }
}
