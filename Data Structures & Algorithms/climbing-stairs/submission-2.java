class Solution {
    public int fun(int n,int i,int[] dp){
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int c1 = fun(n,i+1,dp);
        int c2 = fun(n,i+2,dp);
        int ans = c1 + c2;
        return dp[i] = ans;
    }
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return fun(n,0,dp);
    }
}
