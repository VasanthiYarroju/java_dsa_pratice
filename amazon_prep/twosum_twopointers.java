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
        int[] arr={1,2,3,4,5,6};
        int target=4;
        System.out.println(finstwosum(arr,target));
    }

}
