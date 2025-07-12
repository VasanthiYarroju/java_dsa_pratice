public class MaxAvarageSubArray {

    // Function to find maximum average subarray of size k
    public static double findMaxAverage(int[] nums, int k) {
        int max_sum = 0;

        // Step 1: Sum of first 'k' elements
        for (int i = 0; i < k; i++) {
            max_sum += nums[i];
        }

        int current_sum = max_sum;

        // Step 2: Slide the window
        for (int end = k; end < nums.length; end++) {
            current_sum = current_sum + nums[end] - nums[end - k];
            max_sum = Math.max(max_sum, current_sum);
        }

        // Step 3: Return maximum average
        return (double) max_sum / k;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.println("Maximum average of subarray of size " + k + " is: " + result);
    }
}
