public class twosum_twopointers {
    public static boolean finstwosum(int[] arr,int target){
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) 
            {
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={2,3,5,1,6,4};
        int target=4;
        System.out.println(finstwosum(arr,target));
    }

}
