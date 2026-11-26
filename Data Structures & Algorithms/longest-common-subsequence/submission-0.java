class Solution {
    public int fun(String text1, String text2, int i , int j , int [][] dp,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j] = 1+fun(text1,text2,i+1,j+1,dp,n,m);
        }
        int c1 = fun(text1,text2,i,j+1,dp,n,m);
        int c2 = fun(text1,text2,i+1,j,dp,n,m);
        int ans = Math.max(c1,c2);
        return dp[i][j] = ans;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int [n+1][m+1];
        for(int i = 0 ; i<n+1 ; i++){
            for(int j = 0; j<m+1 ; j++){
                dp[i][j] = -1;
            }
        }
        return fun(text1,text2,0,0,dp,n,m);
    }
}
