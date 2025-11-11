
public class noofregions {
    public static void main(String[] args) {
        int n =2;
        System.out.println(countRegions(n));
    }
    public static int countRegions(int n) {
        return n*(n+1)/2 +1;
    }
}
