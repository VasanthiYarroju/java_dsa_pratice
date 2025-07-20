class Solution{
    static int pick=7;

    //api
    public static int guess(int num){
        if(num==pick){
            return 0;
        }
        else if(num<pick){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class Guessno extends Solution{
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Guessno sol = new Guessno();
        int n = 10; 
        int result = sol.guessNumber(n);
        System.out.println("The number is: " + result);
    }

}