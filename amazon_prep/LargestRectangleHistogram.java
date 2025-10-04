import java.util.*;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];  // nearest smaller to left
        int[] right = new int[n]; // nearest smaller to right

        // Find nearest smaller to right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Clear stack before next use
        stack.clear();

        // Find nearest smaller to left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }

        return ans;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        LargestRectangleHistogram sol = new LargestRectangleHistogram();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bars: ");
        int n = sc.nextInt();
        int[] heights = new int[n];

        System.out.println("Enter the heights of the bars:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxArea = sol.largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + maxArea);
        sc.close();
    }
}
