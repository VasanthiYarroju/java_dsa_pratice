import java.util.ArrayList;
import java.util.List;
public class BestTime_to_buy_sell {
     public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices){
        int minsoFar=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            minsoFar=Math.min(minsoFar,prices[i]);
            res=Math.max(res,prices[i]-minsoFar);
        }    
        return res;    
    }
}
