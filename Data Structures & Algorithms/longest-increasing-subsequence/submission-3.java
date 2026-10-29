class Solution {
    int ans = 0;
    public int fun(int[] nums,int i,int n,int prev,int [][] dp){
        if(i==n){
            return 0;
        }
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        if(prev==-1 || nums[prev]<nums[i]){
            int c1 = 1 + fun(nums,i+1,n,i,dp);
            int c2 = fun(nums,i+1,n,prev,dp);
            return dp[i][prev+1] = Math.max(c1,c2);

        }else{
            return dp[i][prev+1] = fun(nums,i+1,n,prev,dp);
        }
         
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int prev = -1;
        int [][] dp = new int [n][n];
        for(int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(nums,0,n,prev,dp);
    }
}
