

public class Container_max_water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int Width = right - left;
            int currentArea = minHeight * Width;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Container_max_water cmw = new Container_max_water();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(cmw.maxArea(heights)); // Output: 49
    }
}
