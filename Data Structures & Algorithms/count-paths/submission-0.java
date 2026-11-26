class Solution {

    public int fun(int m, int n , int i , int j , int [][] dp){
        if(i==m-1|| j==n-1){
            return 1;
        }
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int c1 = fun(m,n,i,j+1,dp);
        int c2 = fun(m,n,i+1,j,dp);
        int ans = c1+c2;
        return dp[i][j] = ans;
    }

    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m+1][n+1];
        for(int i = 0 ; i<m+1 ; i++){
            for(int j = 0 ; j<n+1 ; j++){
                dp[i][j] = -1;
            }
        }
        return fun(m,n,0,0,dp);
    }
}
