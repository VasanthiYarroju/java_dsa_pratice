public class FindPeak {
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 20, 4, 1, 0};
        int[] arr2 = {10, 20, 15, 2, 23, 90, 67};
        int[] arr3 = {5, 10, 20, 15};

        System.out.println("Peak index in arr1: " + findPeak(arr1)); // Output: 2
        System.out.println("Peak index in arr2: " + findPeak(arr2)); // Output: 5
        System.out.println("Peak index in arr3: " + findPeak(arr3)); // Output: 2
    }
}