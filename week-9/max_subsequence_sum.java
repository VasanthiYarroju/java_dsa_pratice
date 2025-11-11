public class max_subsequence_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,-2,3};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr){
        int curr=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
           curr=curr+arr[i];
           if(curr>max){
                max=curr;
           }
           if(arr[i]<0){
                curr=0;
           }
        }
        return max;
    }
}
