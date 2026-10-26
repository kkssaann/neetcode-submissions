class Solution {
    public int fun(int[] nums, int i,int end,int[]dp){
        if(i>end){
            return 0;
        }
        if(dp[i]!= -1){
            return dp[i];
        }
        int o1 = fun(nums,i+1,end,dp);
        int o2 = nums[i]+fun(nums,i+2,end,dp);
        int output = Math.max(o1,o2);
        return dp[i] = output;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int dp[] = new int [n];
        Arrays.fill(dp,-1);
        int c1 = fun(nums,0,n-2,dp);
        Arrays.fill(dp, -1);
        int c2 = fun(nums,1,n-1,dp);
        int ans = Math.max(c1,c2);
        return ans;
    }
}
