class solution{
    public int climbingStairs(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
public class ClimbingTrees {
    public static void main(String[] args) {
        int n = 5;
        solution sol = new solution();
        int ways = sol.climbingStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
