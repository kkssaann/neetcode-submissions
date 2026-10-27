class Solution {
    public int fun(String s , int i , int [] dp){
        if(i==s.length()){
            return 1;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        if(s.charAt(i)== '0'){
            return dp[i]= 0;
        }
        int c1 = fun(s,i+1,dp);
        int c2 = 0;
        if (i + 1 < s.length()) {
            int num = (s.charAt(i) - '0') * 10
                    + (s.charAt(i + 1) - '0');

            if (num >= 10 && num <= 26) {
                c2 = fun(s, i + 2 , dp);
            }
        }
        return dp[i] =c1 + c2;
    }
    public int numDecodings(String s) {
        int [] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return fun(s,0,dp);
    }
}
