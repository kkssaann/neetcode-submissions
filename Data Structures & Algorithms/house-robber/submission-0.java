class Solution {
    public int fun(int[] nums,int i,int free,int [][] dp){
        if(i==nums.length){
            return 0;
        }
        if(free==0){
            return fun(nums,i+1,1,dp);
        }
        if(dp[i][free]!= -1){
            return dp[i][free];
        }
        int c1 = fun(nums,i+1,1,dp);
        int c2 = nums[i] + fun(nums,i+1,0,dp);
        int ans = Math.max(c1,c2);
        return dp[i][free] = ans;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [][] dp = new int [n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return fun(nums,0,1,dp);
    }
}
