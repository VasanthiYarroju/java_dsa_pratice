package week_7;

public class Finding_rotated_array {
    public static void main(String[] args) {
        // Test different cases
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {2, 1, 3, 4};
        int[] nums4 = {};
        int[] nums5 = null;
        int[] nums6 = {1};
        
        System.out.println("Test 1: " + isRotated(nums1)); // Should be true
        System.out.println("Test 2: " + isRotated(nums2)); // Should be true (no rotation)
        System.out.println("Test 3: " + isRotated(nums3)); // Should be false
        System.out.println("Test 4: " + isRotated(nums4)); // Should handle empty array
        System.out.println("Test 5: " + isRotated(nums5)); // Should handle null
        System.out.println("Test 6: " + isRotated(nums6)); // Should handle single element
    }
    
    public static boolean isRotated(int[] nums){
        if (nums == null || nums.length <= 1) {
            return true; 
        }
        
        int n = nums.length;
        int count = 0;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i-1]) {
                count++;
            }
        }
        
        if (count == 1) {
            return nums[n-1] <= nums[0];
        }
        
        return count == 0; 
    }
}
