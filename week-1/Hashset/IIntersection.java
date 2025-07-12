

import java.util.*;

public class IIntersection {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test input
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = sol.intersection(nums1, nums2);

        // Print result
        System.out.print("Intersection: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)) {
                result.add(i);
            }
        }

        // Convert result set to array
        int[] resArray = new int[result.size()];
        int index = 0;
        for (int i : result) {
            resArray[index++] = i;
        }

        return resArray;
    }
}

