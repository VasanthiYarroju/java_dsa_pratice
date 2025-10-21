import java.util.*;

public class ReversingInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.reverse(x);

        System.out.println("Reversed integer: " + result);
    }
}

class Solution {
    public int reverse(int x) {
        long res = 0;  // use long to detect overflow safely

        while (x != 0) {
            res = res * 10 + x % 10;  // extract and append last digit
            x = x / 10;               // remove last digit

            // check overflow before converting back to int
            if (res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) res; // safe cast after confirming range
    }
}
