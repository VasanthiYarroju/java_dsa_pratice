class HouseRob2 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1));
    }

    private int robLinear(int[] nums, int l, int r) {
        int prev2 = 0; // dp[i-2]
        int prev = 0;  // dp[i-1]

        for (int i = l; i <= r; i++) {
            int curr = Math.max(prev, prev2 + nums[i]); // dp[i] = max(skip, rob)
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        HouseRob2 sol = new HouseRob2();

        
        int[] nums3 = {2, 7, 9, 3, 1}; 
       
        System.out.println("Robbed max (nums3) = " + sol.rob(nums3)); // expected 12
        
    }
}
