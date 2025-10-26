public class Remove_element {
    public static int removeElement(int[] nums,int val){
        int left=0,right=nums.length-1;
        while(left<=right){
            if(nums[left]==val){
                nums[left]=nums[right];
                right--;
            }else{
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        int newLength=removeElement(nums,val);
        System.out.println("New length: "+newLength);
        System.out.print("Array after removing element: ");
        for(int i=0;i<newLength;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
