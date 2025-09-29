import java.util.*;
public class productExceptself {
      public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(product(nums));//it will print the address of the array because array should convert to string and then print
        System.out.println(Arrays.toString(product(nums)));//here it prints the correct array
    }
    public static int[] product(int[] nums){
        int n=nums.length;
        int[] answer=new int[n];

        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];//prefix products stored in answer
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*suffix;
            suffix*=nums[i];//getting suffix from last of the array and then multiply to answer array.
        }
        return answer;
    }
}
