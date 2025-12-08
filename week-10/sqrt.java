public class sqrt {
    public static int mysqrt(int x){
        if(x<2) return x;
        int low=0,high=x,ans=0;
        while(low<=high){

            int mid=low+(high-low)/2;
            long sqrt= (long)mid*mid;
            if(sqrt==x){
                return mid;
            }
            else if(sqrt<x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 8;
        int result = mysqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}
