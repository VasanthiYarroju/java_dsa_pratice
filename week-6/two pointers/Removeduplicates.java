import java.util.Arrays;

public class Removeduplicates {
    public static void main(String[] args) {
      
        int[] nums = {1, 1, 2};

       
        int newLength = removeDuplicates(nums);

        
        System.out.println("New length: " + newLength);
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer for last unique element
        for (int j = 1; j < nums.length; j++) { // fast pointer scans the array
            if (nums[j] != nums[i]) { // new unique element found
                i++;                // move slow pointer
                nums[i] = nums[j];  // overwrite duplicate
            }
        }

        return i + 1; // new length of array with unique elements
    }
}
