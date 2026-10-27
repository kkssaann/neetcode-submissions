class Solution {
    public int fun(int[] coins, int amount, int sum , int i , int [][] dp){
        if(sum==amount){
            return 0;
        }
        if(sum>amount || i>=coins.length){
            return 1000000000;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int c1 = fun(coins,amount,sum,i+1,dp);
        int c2;

        if(coins[i] <= amount - sum){
            c2 = 1 + fun(coins, amount, sum + coins[i], i, dp);
        }
        else{
            c2 = 1000000000;
        }

        int ans = Math.min(c1,c2);
        return dp[i][sum] = ans;
    }
    public int coinChange(int[] coins, int amount) {
        int sum = 0;
        int n = coins.length;
        int [][] dp = new int [coins.length][amount+1];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ;j<=amount ; j++){
                dp[i][j] = -1;
            }
        }
        int ans = fun(coins,amount, sum , 0 , dp) ;
        return ans >= 1000000000 ? -1 : ans;
    }
}
