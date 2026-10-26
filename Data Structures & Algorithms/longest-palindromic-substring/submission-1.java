class Solution {
    public int fun(String s, int i, int j,int [][] dp){
        if(i>=j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i) != s.charAt(j)){
            return dp[i][j]=  0;
        }
        return dp[i][j] =  fun(s,i+1,j-1,dp);
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int n= s.length();
        int [][] dp = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        for(int i = 0; i<s.length() ; i++){
            for(int j = i ; j<s.length(); j++){
                if(fun(s,i,j,dp)==1){
                    String temp = s.substring(i,j+1);
                    if(temp.length()>ans.length()){
                        ans= temp;
                    }
                }
            }
        }
        return ans;
    }
}
