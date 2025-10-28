public class contain_duplicates {
    public static boolean containsDuplicate(int[] nums,int k) {
        int n=nums.length;
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int i = 0; i < n; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);

            if(seen.size() > k) {
                seen.remove(nums[k-i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsDuplicate(nums,k)); // Output: true
    }
}
