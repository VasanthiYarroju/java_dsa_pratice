public class number_1_bits {
    public static int hammingweight(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11; // Example input
        int result = hammingweight(n);
        System.out.println("The number of 1 bits in " + n + " is: " + result);
    }
}
