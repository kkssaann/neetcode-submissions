class Solution {
    public int fun(int[] coins, long amount, int i , int [][] dp){
          if(amount == 0){
            return 0;
        }

        if(amount < 0 || i >= coins.length){
            return 1000000000;
        }

        if(dp[i][(int)amount] != -1){
            return dp[i][(int)amount];
        }

        int c1 = fun(coins, amount, i+1, dp);
        int c2 = 1 + fun(coins, amount-coins[i], i, dp);

        return dp[i][(int)amount] = Math.min(c1, c2);
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
        int ans = fun(coins,amount , 0 , dp) ;
        return ans >= 1000000000 ? -1 : ans;
    }
}
