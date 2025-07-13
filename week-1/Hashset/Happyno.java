import java.util.HashSet;

public class Happyno {
    // Helper function to calculate sum of squares of digits
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Happyno hn = new Happyno();
        System.out.println(hn.isHappy(19)); // true
        System.out.println(hn.isHappy(2));  // false
    }
}
