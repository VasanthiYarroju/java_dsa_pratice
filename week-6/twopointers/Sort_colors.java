public class Sort_colors {
    public void sortcolors(int[] nums){
        int left=0,i=0,right=nums.length-1,t=0;
        while(i<=right){
            if(nums[i]==0){
                t=nums[left];
                nums[left]=nums[i];
                nums[i]=t;
                left++;
                i++;
            }else if(nums[i]==2){
                t=nums[right];
                nums[right]=nums[i];
                nums[i]=t;
                right--;
            }else{
                i++
            }
        }
    }
    public static void main(String[] args) {
        Sort_colors sc=new Sort_colors();
        int[] nums={2,0,2,1,1,0};
        sc.sortcolors(nums);
        System.out.print("Sorted colors: ");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
