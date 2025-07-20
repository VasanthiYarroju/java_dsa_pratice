
public class BinarySearch {
    public int search(int[]  nums, int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch bs=new BinarySearch();
        int[] nums={1,2,3,4,5,6,7,8,9};
        int target=5;
        int res=bs.search(nums, target);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found.");
        }

    }
}
