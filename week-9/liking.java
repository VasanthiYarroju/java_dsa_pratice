import java.util.Arrays;
public class liking {
    public static void main(String[] args){
        int[] l={-1,3,4};
        System.out.println(maxSatisfaction(l));
    }
    public static int maxSatisfaction(int[] l){
        int n=l.length;
        Arrays.sort(l);
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=l[j]*(j-i+1);
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}
