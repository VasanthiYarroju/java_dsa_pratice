import java.util.Arrays;
public class liking {
    public static void main(String[] args){
        int[] l={-1,3,4};
        System.out.println(maxSatisfaction(l));
    }
    public static int maxSatisfaction(int[] l){
        int n=l.length;
        Arrays.sort(l);
        int curr=0;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            curr+=l[i];
            if(curr>0){
                ans+=curr;
            }
            else{
                break;
            }
        }
        return ans;
    }
}