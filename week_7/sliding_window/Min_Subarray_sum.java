public class Min_Subarray_sum {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,2,4,3};
        int target1 = 7;
        int[] nums2 = {1,4,4};
        int target2 = 4;
        int[] nums3 = {1,1,1,1,1,1,1,1};
        int target3 = 11;
        int[] nums4 = {1,2,3,4,5};
        int target4 = 15;
        int[] nums5 = {5,1,3,5,10,7,4,9,2,8};
        int target5 = 15;

        System.out.println("Test 1: " + minSubArrayLen(target1, nums1)); 
        System.out.println("Test 2: " + minSubArrayLen(target2, nums2)); 
        System.out.println("Test 3: " + minSubArrayLen(target3, nums3)); 
        System.out.println("Test 4: " + minSubArrayLen(target4, nums4)); 
        System.out.println("Test 5: " + minSubArrayLen(target5, nums5)); 
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}