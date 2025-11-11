public class max_subsequence_sum {
    public static void main(String[] args) {
        int[] arr = {-1,2,-1,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr){
        int curr=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],curr+arr[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}
